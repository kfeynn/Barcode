package com.barcode.receiving.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barcode.app.model.BM;
import com.barcode.app.model.PN;
import com.barcode.app.model.PNSub;
import com.barcode.app.model.TableResult;
import com.barcode.receiving.dao.DeliverDao;
import com.barcode.receiving.service.IDeliverService;

@Service
public class DeliverServiceImpl implements IDeliverService {
	
	@Autowired
	private DeliverDao deliverDao;

	@Override
	public void updatePN(BM[] bmList) throws Exception {
		
		for(BM bm : bmList){
			String pmm01 = bm.getPmm01();
			int pmn02 = bm.getPmn02();
			int pmn20 = bm.getPmn20();
			String boxnum = bm.getBoxnum();
			String materId = bm.getId();
			
			deliverDao.updateMater(materId, pmn20);
			
			int boxCount = deliverDao.getBoxCountByBoxnum(boxnum);
			deliverDao.updateBox(boxnum, boxCount);
			
			int pnsubCount = deliverDao.getPNSubCountByPO(pmm01, pmn02);
			deliverDao.updatePNSub(pmm01, pmn02, pnsubCount);
		}
	}
	
	@Override
	public void deletePN(BM[] bmList) throws Exception {
		
		for(BM bm : bmList){
			System.out.println(bm);
			String materId = bm.getId();
			String boxnum = bm.getBoxnum();
			String pmm01 = bm.getPmm01();
			int pmn02 = bm.getPmn20();

			deliverDao.deleteMater(materId);
			int boxCount = deliverDao.getBoxCountByBoxnum(boxnum);
			if(boxCount > 0)
				deliverDao.updateBox(boxnum, boxCount);
			else
				deliverDao.deleteBox(boxnum);
			
			int pnsubCount = deliverDao.getPNSubCountByPO(pmm01, pmn02);
			if(pnsubCount > 0)
				deliverDao.updatePNSub(pmm01, pmn02, pnsubCount);
			else 
				deliverDao.deletePNSub(pmm01, pmn02);
		}
	}

	@Override
	public String getDnnumByBoxnum(String boxnum) {
		return deliverDao.getDnnumByBoxnum(boxnum);
	}

	@Override
	public String getDnnumByMaterId(String materId) {
		return deliverDao.getDnnumByMaterId(materId);
	}

	@Override
	public PN findPNByDnnum(String dnnum) {
		return deliverDao.findPNByDnnum(dnnum);
	}

	@Override
	public List<PNSub> findPNSubByDnnum(String dnnum) {
		return deliverDao.findPNSubByDnnum(dnnum);
	}

	@Override
	public List<BM> findBMByDnnum(String dnnum) {
		return deliverDao.findBMByDnnum(dnnum);
	}

	@Override
	public TableResult queryDeliverByPN(String index, String content) {
		
		String dnnum = null;
		switch(index){
		case "1":
			dnnum = content;
			break;
		case "2":
			dnnum = deliverDao.getDnnumByBoxnum(content);
			break;
		case "3":
			dnnum = deliverDao.getDnnumByMaterId(content);
			break;
		default:
			return new TableResult();
		}
		
		if(dnnum != null && dnnum != ""){
			PN pn = deliverDao.findPNByDnnum(dnnum);
			//List<PNSub> pnsubList = deliverDao.findPNSubByDnnum(dnnum);
			List<PNSub> pnsubList = pn.getPnsubs();
			List<BM> bmList = deliverDao.findBMByDnnum(dnnum);
			//List<Box> boxList = deliverService.findBoxByDnnum(dnnum);
			//List<Mater> materList = deliverService.findMaterByDnnum(dnnum);
			return new TableResult(pn, pnsubList, bmList);
		}
		
		return new TableResult();
	}
}
