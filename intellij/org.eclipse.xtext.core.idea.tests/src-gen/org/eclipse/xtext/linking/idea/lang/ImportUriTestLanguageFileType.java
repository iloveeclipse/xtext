package org.eclipse.xtext.linking.idea.lang;

import javax.swing.Icon;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NonNls;

public final class ImportUriTestLanguageFileType extends LanguageFileType {

	public static final ImportUriTestLanguageFileType INSTANCE = new ImportUriTestLanguageFileType();
	
	@NonNls 
	public static final String DEFAULT_EXTENSION = "";

	private ImportUriTestLanguageFileType() {
		super(ImportUriTestLanguageLanguage.INSTANCE);
	}

	public String getDefaultExtension() {
		return DEFAULT_EXTENSION;
	}

	public String getDescription() {
		return "ImportUriTestLanguage files";
	}

	public Icon getIcon() {
		return null;
	}

	public String getName() {
		return "ImportUriTestLanguage";
	}

}