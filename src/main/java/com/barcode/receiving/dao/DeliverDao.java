package com.barcode.receiving.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.barcode.app.model.BM;
import com.barcode.app.model.Box;
import com.barcode.app.model.Mater;
import com.barcode.app.model.PN;
import com.barcode.app.model.PNSub;

public interface DeliverDao {

	PN findPNByDnnum(@Param(value = "dnnum") String dnnum);
	
	List<PNSub> findPNSubByDnnum(@Param(value = "sdnnum") String dnnum);
	
	List<Box> findBoxByDnnum(@Param(value = "pn_dnnum") String dnnum);
	
	List<Mater> findMaterByDnnum(@Param(value = "pn_dnnum") String dnnum);
	
	String getDnnumByBoxnum(@Param(value = "boxnum") String boxnum);
	
	Box getBoxByBoxnum(@Param(value = "boxnum") String boxnum);
	
	String getDnnumByMaterId(@Param(value = "materId") String materId);
	
	List<BM> findBMByDnnum(@Param(value = "dnnum") String dnnum);
	
	PN findPnByBoxnum(@Param(value = "boxnum") String boxnum);
	
	int getPNStatusByDnnum(@Param(value = "tablename") String tablename,
			@Param(value = "supid") String supid,
			@Param(value = "dnnum1") String dnnum1,
			@Param(value = "dnnum2") String dnnum2);
	
	String getBoxIQCStatusByBoxnum(@Param(value = "boxnum") String boxnum,
			@Param(value = "pmn02") int pmn02);
	
	String getRnNumbyBoxnum(@Param(value = "tablename") String tablename,
			@Param(value = "boxnum") String boxnum);
	String getRnNumbyBoxnum1(@Param(value = "tablename") String tablename,
			@Param(value = "boxnum") String boxnum);
	
	/** 获取更新后的送货单数量 */
	int getPNSubCountByPO(@Param(value = "pmm01") String pmm01,
						  @Param(value = "pmn02") int pmn02);
	
	/** 获取更新后的包装票数量 */
	int getBoxCountByBoxnum(@Param(value = "boxnum") String boxnum);
	
	/** 更新送货单数量 */
	int updatePNSub(@Param(value = "pmm01") String pmm01,
					@Param(value = "pmn02") int pmn02,
					@Param(value = "pmn20") int pmn20);
	
	/** 更新包装票数量 */
	int updateBox(@Param(value = "boxnum") String boxnum,
				  @Param(value = "pmn20") int pmn20);
	
	/** 更新内标签数量 */
	int updateMater(@Param(value = "id") String id,
			  		@Param(value = "pmn20") int pmn20);
	
	/** 删除送货单项 */
	int deletePNSub(@Param(value = "pmm01") String pmm01,
					@Param(value = "pmn02") int pmn02);
	
	/** 删除包装票 */
	int deleteBox(@Param(value = "boxnum") String boxnum);
	
	/** 删除内标签 */
	int deleteMater(@Param(value = "id") String id);
}
