package ${pkgNameController};

import com.ruoyi.common.core.domain.R;
import com.ruoyi.common.core.web.page.TableDataInfo;
import com.ksptooi.app.model.dto.ZskLawApplyDto;
import com.ksptooi.app.services.IZskLawApplyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/${fieldControllerName}")
@Api(tags = "${classTableName}")
@Slf4j
public class ${controllerName} {

    @Autowired
    private ${serviceName} ${fieldServiceName};

    @ApiOperation("列表查询")
    @PostMapping("/getMany")
    public TableDataInfo<${poName}> getMany(@RequestBody ${poName} ${fieldPoName}) {
        return ${fieldServiceName}.getMany(${fieldPoName});
    }

    @ApiOperation("根据id查询单条记录")
    @PostMapping("/getById")
    public R<${poName}> getById(@RequestBody Long id) {
        if (id == null) {
            R.fail("id为必填参数");
        }
        return R.ok(${fieldServiceName}.getById(id));
    }

    @ApiOperation("保存或更新")
    @PostMapping("/saveOrUpdate")
    public R<${poName}> saveOrUpdate(@RequestBody ${poName} ${fieldPoName}) {
        return R.ok(${fieldServiceName}.saveOrUpdate(${fieldPoName}));
    }

    @ApiOperation("根据IDS删除记录")
    @PostMapping("/{ids}")
    public R remove(@RequestBody Long[] ids) {
        if (ids == null || ids.length == 0) {
            R.fail("ids为必填参数");
        }
        return R.ok(${fieldServiceName}.deleteByIds(ids));
    }

}