/*
 * generated by Xtext
 */
grammar PsiInternalTreeTestLanguage;

options {
	superClass=AbstractPsiAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.testlanguages.idea.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.testlanguages.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.eclipse.xtext.testlanguages.idea.lang.TreeTestLanguageElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.testlanguages.services.TreeTestLanguageGrammarAccess;

import com.intellij.lang.PsiBuilder;
}

@parser::members {

private TreeTestLanguageGrammarAccess grammarAccess;

private TreeTestLanguageElementTypeProvider elementTypeProvider;

public PsiInternalTreeTestLanguageParser(PsiBuilder builder, TokenStream input, TokenTypeProvider tokenTypeProvider, TreeTestLanguageElementTypeProvider elementTypeProvider, TreeTestLanguageGrammarAccess grammarAccess) {
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
			{
				markComposite(elementTypeProvider.getModel_ChildrenNodeParserRuleCall_0ElementType());
			}
			lv_children_0_0=ruleNode
			{
				doneComposite();
			}
		)
	)*
;

//Entry rule entryRuleNode
entryRuleNode:
	{ markComposite(elementTypeProvider.getNodeElementType()); }
	ruleNode
	{ doneComposite(); }
	EOF;
finally {
}

// Rule Node
ruleNode:
	(
		(
			(
				{
					markLeaf();
				}
				lv_name_0_0=RULE_ID
				{
					doneLeaf(lv_name_0_0, elementTypeProvider.getNode_NameIDTerminalRuleCall_0_0ElementType());
				}
			)
		)
		{
			markLeaf();
		}
		otherlv_1='('
		{
			doneLeaf(otherlv_1, elementTypeProvider.getNode_LeftParenthesisKeyword_1ElementType());
		}
		(
			(
				{
					markLeaf();
				}
				lv_attrib_2_0=RULE_STRING
				{
					doneLeaf(lv_attrib_2_0, elementTypeProvider.getNode_AttribSTRINGTerminalRuleCall_2_0ElementType());
				}
			)
		)
		{
			markLeaf();
		}
		otherlv_3=')'
		{
			doneLeaf(otherlv_3, elementTypeProvider.getNode_RightParenthesisKeyword_3ElementType());
		}
		{
			markLeaf();
		}
		otherlv_4='{'
		{
			doneLeaf(otherlv_4, elementTypeProvider.getNode_LeftCurlyBracketKeyword_4ElementType());
		}
		(
			(
				{
					markComposite(elementTypeProvider.getNode_ChildrenNodeParserRuleCall_5_0ElementType());
				}
				lv_children_5_0=ruleNode
				{
					doneComposite();
				}
			)
		)*
		{
			markLeaf();
		}
		otherlv_6='};'
		{
			doneLeaf(otherlv_6, elementTypeProvider.getNode_RightCurlyBracketSemicolonKeyword_6ElementType());
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