package com.barcode.common.utils;

import java.net.URL;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

public class EHCacheUtil {

	private static final String path = "/ehcache.xml";

	private URL url;

	private CacheManager manager;

	private static EHCacheUtil ehCache;

	private EHCacheUtil(String path) {
		url = getClass().getResource(path);
		manager = CacheManager.create(url);
	}

	public static EHCacheUtil getInstance() {
		if (ehCache == null) {
			synchronized (EHCacheUtil.class) {
				if (ehCache == null) {
					ehCache = new EHCacheUtil(path);
				}
			}
		}
		return ehCache;
	}

	public void put(String cacheName, String key, Object value) {
		Cache cache = manager.getCache(cacheName);
		Element element = new Element(key, value);
		cache.put(element);
	}

	public Object get(String cacheName, String key) {
		Cache cache = manager.getCache(cacheName);
		Element element = cache.get(key);
		return element == null ? null : element.getObjectValue();
	}

	public Cache get(String cacheName) {
		return manager.getCache(cacheName);
	}

	public void remove(String cacheName, String key) {
		Cache cache = manager.getCache(cacheName);
		cache.remove(key);
	}

}
