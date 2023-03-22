package com.guanlisheng.alluxio;


import alluxio.client.file.cache.filter.CacheFilter;
import alluxio.client.file.URIStatus;
import alluxio.conf.AlluxioConfiguration;

/**
 * Cache Filter cache nothing.
 */
public class NoCacheFilter implements CacheFilter {
  /**
   * The default constructor.
   * @param conf the Alluxio Configuration
   * @param cacheConfigFile the cache config giles
   */
  public NoCacheFilter(AlluxioConfiguration conf, String cacheConfigFile) {
  }

  /**
   * The implementation of needsCache.
   * @param uriStatus the uri
   * @return true for everything
   */
  public boolean needsCache(URIStatus uriStatus) {
    return false;
  }
}
