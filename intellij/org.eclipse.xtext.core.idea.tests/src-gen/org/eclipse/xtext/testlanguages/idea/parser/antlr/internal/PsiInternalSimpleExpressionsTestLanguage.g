/*
 * generated by Xtext
 */
grammar PsiInternalSimpleExpressionsTestLanguage;

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
import org.eclipse.xtext.testlanguages.idea.lang.SimpleExpressionsTestLanguageElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.testlanguages.services.SimpleExpressionsTestLanguageGrammarAccess;

import com.intellij.lang.PsiBuilder;
}

@parser::members {

private SimpleExpressionsTestLanguageGrammarAccess grammarAccess;

private SimpleExpressionsTestLanguageElementTypeProvider elementTypeProvider;

public PsiInternalSimpleExpressionsTestLanguageParser(PsiBuilder builder, TokenStream input, TokenTypeProvider tokenTypeProvider, SimpleExpressionsTestLanguageElementTypeProvider elementTypeProvider, SimpleExpressionsTestLanguageGrammarAccess grammarAccess) {
	super(builder, input, tokenTypeProvider);
    this.grammarAccess = grammarAccess;
	this.elementTypeProvider = elementTypeProvider;
}

@Override
protected String getFirstRuleName() {
	return "Sequence";
}

}

//Entry rule entryRuleSequence
entryRuleSequence:
	{ markComposite(elementTypeProvider.getSequenceElementType()); }
	ruleSequence
	{ doneComposite(); }
	EOF;
finally {
}

// Rule Sequence
ruleSequence:
	(
		{
			markComposite(elementTypeProvider.getSequence_AdditionParserRuleCall_0ElementType());
		}
		ruleAddition
		{
			doneComposite();
		}
		(
			(
				{
					precedeComposite(elementTypeProvider.getSequence_SequenceExpressionsAction_1_0ElementType());
					doneComposite();
				}
			)
			(
				(
					{
						markComposite(elementTypeProvider.getSequence_ExpressionsAdditionParserRuleCall_1_1_0ElementType());
					}
					lv_expressions_2_0=ruleAddition
					{
						doneComposite();
					}
				)
			)
		)*
	)
;

//Entry rule entryRuleAddition
entryRuleAddition:
	{ markComposite(elementTypeProvider.getAdditionElementType()); }
	ruleAddition
	{ doneComposite(); }
	EOF;
finally {
}

// Rule Addition
ruleAddition:
	(
		{
			markComposite(elementTypeProvider.getAddition_MultiplicationParserRuleCall_0ElementType());
		}
		ruleMultiplication
		{
			doneComposite();
		}
		(
			(
				{
					precedeComposite(elementTypeProvider.getAddition_OpValuesAction_1_0ElementType());
					doneComposite();
				}
			)
			(
				(
					(
						{
							markLeaf();
						}
						lv_operator_2_1='+'
						{
							doneLeaf(lv_operator_2_1, elementTypeProvider.getAddition_OperatorPlusSignKeyword_1_1_0_0ElementType());
						}
						    |
						{
							markLeaf();
						}
						lv_operator_2_2='-'
						{
							doneLeaf(lv_operator_2_2, elementTypeProvider.getAddition_OperatorHyphenMinusKeyword_1_1_0_1ElementType());
						}
					)
				)
			)
			(
				(
					{
						markComposite(elementTypeProvider.getAddition_ValuesMultiplicationParserRuleCall_1_2_0ElementType());
					}
					lv_values_3_0=ruleMultiplication
					{
						doneComposite();
					}
				)
			)
		)*
	)
;

//Entry rule entryRuleMultiplication
entryRuleMultiplication:
	{ markComposite(elementTypeProvider.getMultiplicationElementType()); }
	ruleMultiplication
	{ doneComposite(); }
	EOF;
finally {
}

// Rule Multiplication
ruleMultiplication:
	(
		{
			markComposite(elementTypeProvider.getMultiplication_TermParserRuleCall_0ElementType());
		}
		ruleTerm
		{
			doneComposite();
		}
		(
			(
				{
					precedeComposite(elementTypeProvider.getMultiplication_OpValuesAction_1_0ElementType());
					doneComposite();
				}
			)
			(
				(
					(
						{
							markLeaf();
						}
						lv_operator_2_1='*'
						{
							doneLeaf(lv_operator_2_1, elementTypeProvider.getMultiplication_OperatorAsteriskKeyword_1_1_0_0ElementType());
						}
						    |
						{
							markLeaf();
						}
						lv_operator_2_2='/'
						{
							doneLeaf(lv_operator_2_2, elementTypeProvider.getMultiplication_OperatorSolidusKeyword_1_1_0_1ElementType());
						}
					)
				)
			)
			(
				(
					{
						markComposite(elementTypeProvider.getMultiplication_ValuesTermParserRuleCall_1_2_0ElementType());
					}
					lv_values_3_0=ruleTerm
					{
						doneComposite();
					}
				)
			)
		)*
	)
;

//Entry rule entryRuleTerm
entryRuleTerm:
	{ markComposite(elementTypeProvider.getTermElementType()); }
	ruleTerm
	{ doneComposite(); }
	EOF;
finally {
}

// Rule Term
ruleTerm:
	(
		{
			markComposite(elementTypeProvider.getTerm_AtomParserRuleCall_0ElementType());
		}
		ruleAtom
		{
			doneComposite();
		}
		    |
		{
			markComposite(elementTypeProvider.getTerm_ParensParserRuleCall_1ElementType());
		}
		ruleParens
		{
			doneComposite();
		}
	)
;

//Entry rule entryRuleAtom
entryRuleAtom:
	{ markComposite(elementTypeProvider.getAtomElementType()); }
	ruleAtom
	{ doneComposite(); }
	EOF;
finally {
}

// Rule Atom
ruleAtom:
	(
		(
			{
				markLeaf();
			}
			lv_name_0_0=RULE_ID
			{
				doneLeaf(lv_name_0_0, elementTypeProvider.getAtom_NameIDTerminalRuleCall_0ElementType());
			}
		)
	)
;

//Entry rule entryRuleParens
entryRuleParens:
	{ markComposite(elementTypeProvider.getParensElementType()); }
	ruleParens
	{ doneComposite(); }
	EOF;
finally {
}

// Rule Parens
ruleParens:
	(
		{
			markLeaf();
		}
		otherlv_0='('
		{
			doneLeaf(otherlv_0, elementTypeProvider.getParens_LeftParenthesisKeyword_0ElementType());
		}
		{
			markComposite(elementTypeProvider.getParens_AdditionParserRuleCall_1ElementType());
		}
		ruleAddition
		{
			doneComposite();
		}
		{
			markLeaf();
		}
		otherlv_2=')'
		{
			doneLeaf(otherlv_2, elementTypeProvider.getParens_RightParenthesisKeyword_2ElementType());
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