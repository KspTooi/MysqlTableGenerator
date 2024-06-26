package com.ksptooi.config;

import com.ksptooi.model.config.MtgGenOptions;

import java.io.File;

public class GenConfigBuilder {

    private MtgGenOptions target = null;


    public GenConfigBuilder(){
        target = new MtgGenOptions();
    }

    public GenConfigBuilder genController(boolean b){
        target.setGenController(b);
        return this;
    }

    public GenConfigBuilder genService(boolean b){
        target.setGenService(b);
        return this;
    }

    public GenConfigBuilder withImpl(boolean b){
        target.setWithImpl(b);
        return this;
    }

    public GenConfigBuilder genPo(boolean b){
        target.setGenPo(b);
        return this;
    }

    public GenConfigBuilder genMapper(boolean b){
        target.setGenMapper(b);
        return this;
    }

    public GenConfigBuilder packetName(String in){
        target.setPacketName(in);
        return this;
    }

    public GenConfigBuilder controllerName(String in){
        target.setControllerName(in);
        return this;
    }

    public GenConfigBuilder serviceName(String in){
        target.setServiceName(in);
        return this;
    }

    public GenConfigBuilder serviceImplName(String in){
        target.setServiceImplName(in);
        return this;
    }

    public GenConfigBuilder poName(String in){
        target.setPoName(in);
        return this;
    }

    public GenConfigBuilder mapperName(String in){
        target.setMapperName(in);
        return this;
    }

    public GenConfigBuilder tableName(String in) {
        target.setTableName(in);
        return this;
    }

    public GenConfigBuilder primaryField(String in){
        target.setPrimaryField(in);
        return this;
    }

    public GenConfigBuilder packetNameController(String in){
        target.setPkgNameController(in);
        return this;
    }

    public GenConfigBuilder packetNameService(String in){
        target.setPkgNameService(in);
        return this;
    }

    public GenConfigBuilder packetNameServiceImpl(String in){
        target.setPkgNameServiceImpl(in);
        return this;
    }

    public GenConfigBuilder packetNamePo(String in){
        target.setPkgNamePo(in);
        return this;
    }

    public GenConfigBuilder packetNameMapper(String in){
        target.setPkgNameMapper(in);
        return this;
    }

    public GenConfigBuilder projectName(String in){
        target.setProjectName(in);
        return this;
    }

    public GenConfigBuilder enableLombok(boolean b){
        target.setEnableLombok(b);
        return this;
    }

    public GenConfigBuilder enableMybatisPlus(boolean b){
        target.setEnableMybatisPlus(b);
        return this;
    }

    public GenConfigBuilder enableSwagger2(boolean b){
        target.setEnableSwagger2(b);
        return this;
    }

    public GenConfigBuilder packetNameVo(String in){
        target.setPkgNameVo(in);
        return this;
    }

    public GenConfigBuilder genVo(boolean in){
        target.setGenVo(in);
        return this;
    }

    public GenConfigBuilder voName(String in){
        target.setVoName(in);
        return this;
    }

    public GenConfigBuilder outputTo(String f){
        target.setOutputPath(new File(f));
        return this;
    }

    public GenConfigBuilder outputXmlTo(String f){
        target.setOutputXmlPath(new File(f));
        return this;
    }

    public GenConfigBuilder silence(boolean b){
        target.setSilence(b);
        return this;
    }

    public GenConfigBuilder put(String k,Object v){
        target.getOpt().put(k,v);
        return this;
    }

    public GenConfigBuilder namespace(String s){
        target.setTemplateNameSpace(s);
        return this;
    }

    public MtgGenOptions build(){
        return target;
    }

}
