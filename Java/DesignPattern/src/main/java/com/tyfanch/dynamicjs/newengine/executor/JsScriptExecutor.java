package com.tyfanch.dynamicjs.newengine.executor;

import com.tyfanch.dynamicjs.utils.JsRunnerUtils;

/**
 * JavaScript脚本执行器
 */
public class JsScriptExecutor implements ScriptExecutor {
    @Override
    public Object execute(String script) throws Exception {
        Object result;

        result = JsRunnerUtils.eval(script);

        return result;
    }

    @Override
    public Object execute(String engineName, String script) throws Exception {
        Object result;

        JsRunnerUtils.withEngine(engineName);
        result = this.execute(script);

        return result;
    }
}
