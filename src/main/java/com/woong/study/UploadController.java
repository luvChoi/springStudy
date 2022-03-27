package com.woong.study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
	
	// 파일 검사 & 업로드 기능	
	@RequestMapping("/uploadFile.do")
	public String uploadFile() {
		return "uploadFile";
	}
	
	@RequestMapping(value="/uploadFileProc.do", method=RequestMethod.POST)
	public String uploadFileProc(
			@RequestParam(value="fileId", required=true) MultipartFile uploadFile) throws Exception {
				
		InputStreamReader isr = new InputStreamReader(uploadFile.getInputStream());
		
		BufferedReader br = new BufferedReader(isr);
		String line = "";
		
		for(int i=1; (line = br.readLine()) != null; i++) {
			System.out.println(line);
		}
		
		return "redirect:uploadFile.do";
	}
	
}
