package com.dogeking;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.*;

public class SemanticContext {

    private final ParserRuleContext ast;

    private Map<String, TableMetaData> metaDataMapping = new HashMap<>();

    public SemanticContext(ParserRuleContext ast) {
        this.ast = ast;
    }

    public ParserRuleContext getAst() {
        return ast;
    }



    public Map<String, TableMetaData> getMetaDataMapping() {
        return metaDataMapping;
    }

    public void setMetaDataMapping(Map<String, TableMetaData> metaDataMapping) {
        this.metaDataMapping = metaDataMapping;
    }
}
