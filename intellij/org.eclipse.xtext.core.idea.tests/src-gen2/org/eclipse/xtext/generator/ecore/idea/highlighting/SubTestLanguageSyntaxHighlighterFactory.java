/*
 * generated by Xtext
 */
package org.eclipse.xtext.generator.ecore.idea.highlighting;

import com.intellij.openapi.fileTypes.SingleLazyInstanceSyntaxHighlighterFactory;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import org.eclipse.xtext.generator.ecore.idea.lang.SubTestLanguageLanguage;
import org.jetbrains.annotations.NotNull;

public class SubTestLanguageSyntaxHighlighterFactory extends SingleLazyInstanceSyntaxHighlighterFactory {
	
	@Override
    @NotNull
    protected SyntaxHighlighter createHighlighter() {
        return SubTestLanguageLanguage.INSTANCE.getInstance(SyntaxHighlighter.class);
    }
}
