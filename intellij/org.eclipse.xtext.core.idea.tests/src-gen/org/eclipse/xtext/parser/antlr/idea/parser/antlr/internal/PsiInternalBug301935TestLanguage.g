/*
 * generated by Xtext
 */
grammar PsiInternalBug301935TestLanguage;

options {
	superClass=AbstractPsiAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.parser.antlr.idea.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.parser.antlr.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.eclipse.xtext.parser.antlr.idea.lang.Bug301935TestLanguageElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.services.Bug301935TestLanguageGrammarAccess;

import com.intellij.lang.PsiBuilder;
}

@parser::members {

private Bug301935TestLanguageGrammarAccess grammarAccess;

private Bug301935TestLanguageElementTypeProvider elementTypeProvider;

public PsiInternalBug301935TestLanguageParser(PsiBuilder builder, TokenStream input, TokenTypeProvider tokenTypeProvider, Bug301935TestLanguageElementTypeProvider elementTypeProvider, Bug301935TestLanguageGrammarAccess grammarAccess) {
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
					markLeaf();
				}
				lv_name_0_0=RULE_ID
				{
					doneLeaf(lv_name_0_0, elementTypeProvider.getModel_NameIDTerminalRuleCall_0_0ElementType());
				}
			)
		)
		{
			markLeaf();
		}
		this_WS_1=RULE_WS
		{
			doneLeaf(this_WS_1, elementTypeProvider.getModel_WSTerminalRuleCall_1ElementType());
		}
		(
			(
				{
					markLeaf();
				}
				lv_value_2_0=RULE_ID
				{
					doneLeaf(lv_value_2_0, elementTypeProvider.getModel_ValueIDTerminalRuleCall_2_0ElementType());
				}
			)
		)
		{
			markComposite(elementTypeProvider.getModel_NLParserRuleCall_3ElementType());
		}
		ruleNL
		{
			doneComposite();
		}
		(
			(
				{
					markLeaf();
				}
				lv_value2_4_0=RULE_ID
				{
					doneLeaf(lv_value2_4_0, elementTypeProvider.getModel_Value2IDTerminalRuleCall_4_0ElementType());
				}
			)
		)
		{
			markLeaf();
		}
		this_WS_5=RULE_WS
		{
			doneLeaf(this_WS_5, elementTypeProvider.getModel_WSTerminalRuleCall_5ElementType());
		}
	)
;

//Entry rule entryRuleNL
entryRuleNL:
	{ markComposite(elementTypeProvider.getNLElementType()); }
	ruleNL
	{ doneComposite(); }
	EOF;
finally {
}

// Rule NL
ruleNL:
	(
		(
			{
				markLeaf();
			}
			this_WS_0=RULE_WS
			{
				doneLeaf(this_WS_0, elementTypeProvider.getNL_WSTerminalRuleCall_0ElementType());
			}
		)*
		(
			(
				{
					markLeaf();
				}
				kw='\r'
				{
					doneLeaf(kw, elementTypeProvider.getNL_CarriageReturnCrKeyword_1_0ElementType());
				}
			)?
			{
				markLeaf();
			}
			kw='\n'
			{
				doneLeaf(kw, elementTypeProvider.getNL_LineFeedLfKeyword_1_1ElementType());
			}
		)
		(
			{
				markLeaf();
			}
			this_WS_3=RULE_WS
			{
				doneLeaf(this_WS_3, elementTypeProvider.getNL_WSTerminalRuleCall_2ElementType());
			}
		)*
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_WS : (' '|'\t')+;

RULE_ANY_OTHER : .;