package com.tyfanch.dynamicjs.newengine.parser;

import com.tyfanch.dynamicjs.newengine.model.ScriptConfig;

/**
 * 配置解析类，解析的方式由子类决定
 */
public interface ConfigParser {
    /**
     * 解析配置
     *
     * @return 解析出来的Script配置
     */
    ScriptConfig parseScriptConfig();
}
