package com.my;

import java.io.*;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class FileUpload extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
			List<FileItem> multifile = sf.parseRequest(request);

			for (FileItem item : multifile) {
				//item.write(new File("D:\\New_WorkSpace\\FileUploadDemo" + item.getName()));
				item.write(new File("D:\\New_WorkSpace\\FileUploadDemo" + item.getName()));
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("File Uploaded");
	}

}
