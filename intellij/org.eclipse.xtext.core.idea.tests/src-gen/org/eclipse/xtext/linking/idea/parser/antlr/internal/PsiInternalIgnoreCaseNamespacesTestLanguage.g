/*
 * generated by Xtext
 */
grammar PsiInternalIgnoreCaseNamespacesTestLanguage;

options {
	superClass=AbstractPsiAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.linking.idea.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.linking.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.eclipse.xtext.linking.idea.lang.IgnoreCaseNamespacesTestLanguageElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.linking.services.IgnoreCaseNamespacesTestLanguageGrammarAccess;

import com.intellij.lang.PsiBuilder;
}

@parser::members {

private IgnoreCaseNamespacesTestLanguageGrammarAccess grammarAccess;

private IgnoreCaseNamespacesTestLanguageElementTypeProvider elementTypeProvider;

public PsiInternalIgnoreCaseNamespacesTestLanguageParser(PsiBuilder builder, TokenStream input, TokenTypeProvider tokenTypeProvider, IgnoreCaseNamespacesTestLanguageElementTypeProvider elementTypeProvider, IgnoreCaseNamespacesTestLanguageGrammarAccess grammarAccess) {
	super(builder, input, tokenTypeProvider);
    this.grammarAccess = grammarAccess;
	this.elementTypeProvider = elementTypeProvider;
}

@Override
protected String getFirstRuleName() {
	return "Model";
}

}

//Entry rule entryRuleModel
entryRuleModel:
	{ markComposite(elementTypeProvider.getModelElementType()); }
	ruleModel
	{ doneComposite(); }
	EOF;
finally {
}

// Rule Model
ruleModel:
	(
		(
			(
				{
					markComposite(elementTypeProvider.getModel_ImportsImportParserRuleCall_0_0ElementType());
				}
				lv_imports_0_0=ruleImport
				{
					doneComposite();
				}
			)
		)*
		(
			(
				{
					markComposite(elementTypeProvider.getModel_ElementsElementParserRuleCall_1_0ElementType());
				}
				lv_elements_1_0=ruleElement
				{
					doneComposite();
				}
			)
		)+
	)
;

//Entry rule entryRuleImport
entryRuleImport:
	{ markComposite(elementTypeProvider.getImportElementType()); }
	ruleImport
	{ doneComposite(); }
	EOF;
finally {
}

// Rule Import
ruleImport:
	(
		(
			{
				markLeaf();
			}
			lv_importedNamespace_0_0=RULE_STRING
			{
				doneLeaf(lv_importedNamespace_0_0, elementTypeProvider.getImport_ImportedNamespaceSTRINGTerminalRuleCall_0ElementType());
			}
		)
	)
;

//Entry rule entryRuleElement
entryRuleElement:
	{ markComposite(elementTypeProvider.getElementElementType()); }
	ruleElement
	{ doneComposite(); }
	EOF;
finally {
}

// Rule Element
ruleElement:
	(
		(
			(
				{
					markLeaf();
				}
				lv_name_0_0=RULE_ID
				{
					doneLeaf(lv_name_0_0, elementTypeProvider.getElement_NameIDTerminalRuleCall_0_0ElementType());
				}
			)
		)
		(
			(
				{
					markLeaf();
				}
				otherlv_1=RULE_ID
				{
					doneLeaf(otherlv_1, elementTypeProvider.getElement_ReferenceElementCrossReference_1_0ElementType());
				}
			)
		)?
		{
			markLeaf();
		}
		otherlv_2='{'
		{
			doneLeaf(otherlv_2, elementTypeProvider.getElement_LeftCurlyBracketKeyword_2ElementType());
		}
		(
			(
				{
					markComposite(elementTypeProvider.getElement_ElementsElementParserRuleCall_3_0ElementType());
				}
				lv_elements_3_0=ruleElement
				{
					doneComposite();
				}
			)
		)*
		{
			markLeaf();
		}
		otherlv_4='}'
		{
			doneLeaf(otherlv_4, elementTypeProvider.getElement_RightCurlyBracketKeyword_4ElementType());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;