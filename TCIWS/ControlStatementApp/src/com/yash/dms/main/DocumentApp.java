package com.yash.dms.main;

import com.yash.dms.service.DocumentService;
public class DocumentApp {
	public static void main(String[] args) {
		DocumentService documentService=new DocumentService();
		documentService.setRead(false);
		String message=documentService.showDocumentReadStatus();
		System.out.println("Staus : "+message);
		System.out.println(documentService.showDocumentCategoryCount(40) + " Categories having more than "+40 +" documents");
	}
}
