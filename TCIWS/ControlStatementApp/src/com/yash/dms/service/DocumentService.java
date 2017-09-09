package com.yash.dms.service;

public class DocumentService {
	// instance variables
	private boolean isRead;
	private int[] category={29,40,15,10,50};
	
	public boolean isRead() {
		return isRead;
	}

	public void setRead(boolean isRead) {
		this.isRead = isRead;
	}
	
	public String showDocumentReadStatus(){
		String msg;
		if(isRead()){
			msg="Document is Read";
		}
		else{
			msg="Document is not Read";
		}
		
		return msg;
	}
	
	public int showDocumentCategoryCount(int documentNumberTobeSearched) {
		//local variable
		int categoryCount=0;
		for(int i=0;i<category.length;i++){
			if(category[i]>documentNumberTobeSearched){
				categoryCount++;
			}
		}
		
		return categoryCount;
	}

}
