package com.arwen.vlog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@Controller
public class UploadController {
    private final static String FILE_UPLAD_PATH = "/Users/xiaopengzou/IdeaProjects/vlog/upload/";

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return "Upload Failed";
        }

        String fileName = file.getOriginalFilename();
        String suffixName = fileName.substring(fileName.indexOf("."));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        sb.append(sdf.format(new Date())).append(rand.nextInt(100)).append(suffixName);
        String newFileName = sb.toString();
        try {
            byte[] bytes = file.getBytes();
            Path path = Paths.get(FILE_UPLAD_PATH + newFileName);
            Files.write(path, bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "Uploaded Successfully, address: /files/" + newFileName;
    }
}
