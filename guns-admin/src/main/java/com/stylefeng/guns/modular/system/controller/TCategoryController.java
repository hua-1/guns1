package com.stylefeng.guns.modular.system.controller;

import com.stylefeng.guns.core.base.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import com.stylefeng.guns.core.log.LogObjectHolder;
import org.springframework.web.bind.annotation.RequestParam;
import com.stylefeng.guns.modular.system.model.TCategory;
import com.stylefeng.guns.modular.system.service.ITCategoryService;

/**
 * 商品分类控制器
 *
 * @author fengshuonan
 * @Date 2018-07-19 22:38:09
 */
@Controller
@RequestMapping("/tCategory")
public class TCategoryController extends BaseController {

    private String PREFIX = "/system/tCategory/";

    @Autowired
    private ITCategoryService tCategoryService;

    /**
     * 跳转到商品分类首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "tCategory.html";
    }

    /**
     * 跳转到添加商品分类
     */
    @RequestMapping("/tCategory_add")
    public String tCategoryAdd() {
        return PREFIX + "tCategory_add.html";
    }

    /**
     * 跳转到修改商品分类
     */
    @RequestMapping("/tCategory_update/{tCategoryId}")
    public String tCategoryUpdate(@PathVariable Integer tCategoryId, Model model) {
        TCategory tCategory = tCategoryService.selectById(tCategoryId);
        model.addAttribute("item",tCategory);
        LogObjectHolder.me().set(tCategory);
        return PREFIX + "tCategory_edit.html";
    }

    /**
     * 获取商品分类列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return tCategoryService.selectList(null);
    }

    /**
     * 新增商品分类
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(TCategory tCategory) {
        tCategoryService.insert(tCategory);
        return SUCCESS_TIP;
    }

    /**
     * 删除商品分类
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Integer tCategoryId) {
        tCategoryService.deleteById(tCategoryId);
        return SUCCESS_TIP;
    }

    /**
     * 修改商品分类
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(TCategory tCategory) {
        tCategoryService.updateById(tCategory);
        return SUCCESS_TIP;
    }

    /**
     * 商品分类详情
     */
    @RequestMapping(value = "/detail/{tCategoryId}")
    @ResponseBody
    public Object detail(@PathVariable("tCategoryId") Integer tCategoryId) {
        return tCategoryService.selectById(tCategoryId);
    }
}
