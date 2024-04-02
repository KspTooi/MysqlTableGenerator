package ${packetNamePo};

import java.util.Date;
#if(${enableLombok})
import lombok.Getter;
import lombok.Setter;
#end
#if(${enableSwagger2})
import io.swagger.annotations.ApiModelProperty;
#end
#if(${enableMybatisPlus})
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
#end

#if(${enableLombok})
@Getter
@Setter
#end
#if(${enableMybatisPlus})
@TableName("${tableName}")
#end
public class ${poName}{

    #foreach ($field in $fields)

    #if(${field.comment} != "")
    #if(${enableSwagger2})
    @ApiModelProperty(value="${field.comment}")
    #end
    #if(!${enableSwagger2})
    //${field.comment}
    #end
    #end
    #if(${field.primary})
    #if(${enableMybatisPlus})
    @TableId(type = IdType.ASSIGN_ID)
    #end
    #end
    private ${field.javaType} ${field.javaFieldName};
    #end

    #if(!${enableLombok})
    #foreach ($field in $fields)
    public ${field.javaType} get${field.javaGetterName}() {
        return this.${field.javaFieldName};
    }
    public void set${field.javaGetterName}(${field.javaType} ${field.javaFieldName}) {
        this.${field.javaFieldName} = ${field.javaFieldName};
    }
    #end
    #end

}

