package com.barcode.core.cache;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.session.Session;

import com.barcode.common.utils.EHCacheUtil;
import com.barcode.common.utils.LoggerUtils;
import com.barcode.common.utils.StringUtils;

public class CacheManager<K, V> implements Cache<K, V> {
	
	//setter注入
	private EhCacheManager cacheManager;
	
	private Cache<K, V> cache = null;
	
	public Cache<K, V> getCache(){
		try {
			if (cache == null) {
				synchronized (CacheManager.class) {
					if (cache == null) {
						cache = cacheManager.getCache("session_cache");
					}
				}
			}
		}catch(Exception e){
			//获取缓存错误
			throw new RuntimeException(e);
		}
		return cache;
	}

	public void clear() throws CacheException {
		getCache().clear();
	}

	public V get(K key) throws CacheException {
		System.out.println("get key : " + key);
		/*V v = null;
		Set<byte[]> keys = (Set<byte[]>) getCache().keys();
		Iterator<byte[]> it = keys.iterator();
		while(it.hasNext()){
			byte[] id = it.next();
			System.out.println(SerializeUtil.deserialize(id));
			if(key == id){

			}
		}*/
		
		//System.out.println(getCache().keys().contains(key));
		
		return getCache().keys().contains(key)?getCache().get(key):null;
	}

	public Set<K> keys() {
		/*Set<K> k = new HashSet<K>();
		Set<byte[]> keys = (Set<byte[]>) getCache().keys();
		Iterator<byte[]> it = keys.iterator();
		while(it.hasNext()){		
			byte[] id = it.next();
			k.add((K) SerializeUtil.deserialize(id));
		}
		return k;*/
		
		return getCache().keys();
	}

	public V put(K key, V value) throws CacheException {
		System.out.println(key);
		System.out.println(value);
		return getCache().put(key, value);
	}

	public V remove(K key) throws CacheException {
		return getCache().remove(key);
	}

	public int size() {
		return getCache().size();
	}

	public Collection<V> values() {
		return getCache().values();
	}
	
	public Collection<Session> getAllSession(){
		Set<Session> sessions = new HashSet<Session>();
		try{
			cache = getCache();
			Collection<V> values = cache.values();
			for(V v : values){
				if(StringUtils.isNotBlank(v) && v instanceof Session){
					sessions.add((Session) v);
				}
			}
			
			/*cache = getCache();
			Collection<byte[]> values = (Collection<byte[]>) cache.values();
			for(byte[] v : values){
				if(StringUtils.isNotBlank(v)){
					Session session = (Session) SerializeUtil.deserialize(v);
					sessions.add(session);
				}
			}*/
		}catch(Exception e){
			LoggerUtils.fmtError(getClass(), e, "获取所有session错误");
		}
		return sessions;
	}
	
	
	public void setCache(Cache<K, V> cache) {
		this.cache = cache;
	}

	public EhCacheManager getCacheManager() {
		return cacheManager;
	}

	public void setCacheManager(EhCacheManager cacheManager) {
		this.cacheManager = cacheManager;
	}
}
