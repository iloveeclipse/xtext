package org.eclipse.xtext.serializer.idea.lang.parser;

import org.antlr.runtime.TokenStream;
import org.eclipse.xtext.idea.parser.AbstractXtextPsiParser;
import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.eclipse.xtext.serializer.idea.lang.AssignmentFinderTestLanguageElementTypeProvider;
import org.eclipse.xtext.serializer.idea.parser.antlr.internal.PsiInternalAssignmentFinderTestLanguageParser;
import org.eclipse.xtext.serializer.services.AssignmentFinderTestLanguageGrammarAccess;

import com.google.inject.Inject;
import com.intellij.lang.PsiBuilder;

public class AssignmentFinderTestLanguagePsiParser extends AbstractXtextPsiParser {

	@Inject 
	private AssignmentFinderTestLanguageGrammarAccess grammarAccess;

	@Inject 
	private AssignmentFinderTestLanguageElementTypeProvider elementTypeProvider;

	@Override
	protected AbstractPsiAntlrParser createParser(PsiBuilder builder, TokenStream tokenStream) {
		return new PsiInternalAssignmentFinderTestLanguageParser(builder, tokenStream, getTokenTypeProvider(), elementTypeProvider, grammarAccess);
	}

}