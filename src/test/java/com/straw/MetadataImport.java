package com.straw;

import com.straw.guide.Application;
import com.straw.guide.service.SchoolService;
import com.straw.guide.utils.tmp.ScoreInfo;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author straw(fengzy)
 * @description 导入Excel
 * @date 5/17/2018
 */
//@SpringBootTest(classes = Application.class)
//@RunWith(SpringRunner.class)
public class MetadataImport {
    // @Autowired
    SchoolService schoolService;
    String xlsPath = "d://lnfs.xlsx";

    @Test
    public void importDae() {
        List<ScoreInfo> temp = new ArrayList();
        FileInputStream fileIn = null;
        try {
            fileIn = new FileInputStream(xlsPath);
            //根据指定的文件输入流导入Excel从而产生Workbook对象
            //Workbook wb0 = new HSSFWorkbook(fileIn);
            XSSFWorkbook workbook = new XSSFWorkbook(fileIn);
            //获取Excel文档中的第一个表单
            Sheet sht0 = workbook.getSheetAt(0);
            //对Sheet中的每一行进行迭代
            for (Row r : sht0) {
                //如果当前行的行号（从0开始）未达到2（第三行）则从新循环
                if (r.getRowNum() < 1) {
                    continue;
                }
                //创建实体类
                ScoreInfo info = new ScoreInfo();
                //取出当前行第1个单元格数据，并封装在info实体stuName属性上
                if (r.getCell(0) != null) {
                    info.setYxmc(r.getCell(0).getStringCellValue());
                }
                if (r.getCell(1) != null) {
                    info.setCs(r.getCell(1).getStringCellValue());
                }
                if (r.getCell(2) != null) {
                    info.setZszrs(r.getCell(2).getNumericCellValue());
                }
                if (r.getCell(3) != null) {
                    info.setZsnf(r.getCell(3).getNumericCellValue());
                }
                if (r.getCell(4) != null) {
                    info.setXxzdf(r.getCell(4).getNumericCellValue());
                }
                if (r.getCell(5) != null) {
                    info.setZl(r.getCell(5).getStringCellValue());
                }
                if (r.getCell(6) != null) {
                    info.setPc(r.getCell(6).getStringCellValue());
                }
                if (r.getCell(7) != null) {
                    info.setXxcc(r.getCell(7).getStringCellValue());
                }
                if (r.getCell(8) != null) {
                    info.setZy(r.getCell(8).getStringCellValue());
                }
                if (r.getCell(9) != null) {
                    info.setZyzdf2017(r.getCell(9).getNumericCellValue());
                }
                if (r.getCell(10) != null) {
                    info.setLqs2017(r.getCell(10).getNumericCellValue());
                }
                if (r.getCell(11) != null) {
                    info.setZsnf2016(r.getCell(11).getNumericCellValue());
                }
                if (r.getCell(12) != null) {
                    info.setZyzdf2016(r.getCell(12).getNumericCellValue());
                }
                if (r.getCell(13) != null) {
                    info.setZsnf2015(r.getCell(13).getNumericCellValue());
                }
                if (r.getCell(14) != null) {
                    info.setZyzdf2015(r.getCell(14).getNumericCellValue());
                }
                if (r.getCell(15) != null) {
                    info.setZsnf2014(r.getCell(15).getNumericCellValue());
                }
                if (r.getCell(16) != null) {
                    info.setZyzdf2014(r.getCell(16).getNumericCellValue());
                }
                if (r.getCell(17) != null) {
                    info.setZylb(r.getCell(17).getStringCellValue());
                }
                if (r.getCell(18) != null) {
                    info.setXk(r.getCell(18).getStringCellValue());
                }
                if (r.getCell(19) != null) {
                    info.setSf(r.getCell(19).getStringCellValue());
                }
                if (r.getCell(20) != null) {
                    info.setSfdl(r.getCell(20).getStringCellValue());
                }
                System.out.println(info);
                temp.add(info);
                if (r.getRowNum() >= 10) {
                    break;
                }
            }
            fileIn.close();
            schoolService.importData(temp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
