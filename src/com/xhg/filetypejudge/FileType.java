/**
 * @author Haoguang Xu
 * 
 * Copyright (c) 2016, UCAS
 * All rights reserved. 
 * 
 * FileType Class {@link FileType}:定义可能出现的文件类型
 */

package com.xhg.filetypejudge;

public enum FileType {
	jpg("ffd8ff"), // JPEG (jpg)
	png("89504e47"), // PNG (png)
	gif("47494638"), // GIF (gif)
	bmp("424d"), // BMP(bmp)
	html("3c21444f435459504520"), // HTML (html)
	rtf("7b5c72"), // Rich Text Format
	email("5265"), // Email
	pdf("255044"), // pdf
	mp4("0000001866747970"), // mp4
	mp3("494433"), // mp3

	avi("52494646"), // avi
	rar("526172211a0700cf9073"), // rar
	exe_dll("4d5a"), // exe/dll
	swf1("465753"), // swf
	swf2("435753"), // swf
	ttf("000100"), // ttf
	DOCX_XLSX("504b0304140006"), // docx/xlsx
	zip("504b0304"), // zip
	ppt_doc_xls("d0cf11e0a1b11ae1");// ppt/doc/xls

	// EXE("4D5A9000"), // EXE 4D5A9000030000000400
	// DOC_XLS("D0CF11E0"), // DOC
	// DOCX_XLSX("504B0304140006"), // DOCX 504B0304140006000800
	// PPT("D0CF11E0"), // PPT
	// PPTX("504B0304"), // PPTX
	// PDF("25504446"), // PDF
	// APK("504B0304140008"), // APK
	// RTF("7B5C727466"), // RTF
	// SWF("43575306"),// SWF
	// RAR("52617221"), // RAR
	//	
	// EML("44656C69"), // EML
	// ZIP("504B0304"), // ZIP
	// DLL("4D5A9000"), // DLL
	// JPG_JPEG("FFD8FF"), // JPEG FFD8FFE000104A464946
	// MP3("49443303"), // MP3 49443303000000002176
	// MP4("00000020"), // MP4 00000020667479706D70
	// AVI("41564920"), // AVI
	// PNG("89504E47"), // PNG
	// BMP("424D"), // BMP
	// TTF("44434E01"), // TTF
	//	
	// GIF("47494638"), // GIF
	// TIFF("49492A00"), // TIFF
	// DWG("41433130"), // CAD
	// PSD("38425053"), // ADOBE PHOTOSHOP
	// XML("3C3F786D6C"), // XML
	// HTML("68746D6C3E"), // HTML
	// DBX("CFAD12FE"), // OUTLOOK EXPRESS
	// PST("2142444E"), // OUTLOOK (PST)
	// MDB("5374616E"), // MS ACCESS
	// WPD("FF575043"), // WORDPERFECT
	//	
	// EPS("25215053"), // POSTSCRIPT
	// QDF("AC9EBD8F"), // QUICKEN
	// PWL("E3828596"), // WINDOWS PASSWORD
	// WAV("57415645"), // WAVE
	// RAM("2E7261FD"), // REAL AUDIO
	// RM("2E524D46"), // REAL MEDIA
	// MPG("000001BA"), // MPEG (MPG)
	// MOV("6D6F6F76"), // QUICKTIME
	// ASF("3026B275"), // WINDOWS MEDIA
	// MID("4D546864"), // MIDI
	//	
	// CSS("48544D4C"),
	// JS("696B2E71"),
	// VISO("D0CF11E0"),
	// FLV("464C5601"),
	// INI("23546869"),
	// JAR("504B0304"),
	// JSP("3C254020"),
	// SQL("494E5345"),
	// JAVA("40656368"),
	// CAD("41433130"),
	//
	// TORRENT("6431303A"),
	// BAT1("6C6F6734"),//BAT文件
	// BAT2("CAFEBABE"),//BAT文件
	// BAT3("49545346"),//BAT文件
	// BAT4("04000000");//BAT文件

	private String value = "";

	private FileType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
