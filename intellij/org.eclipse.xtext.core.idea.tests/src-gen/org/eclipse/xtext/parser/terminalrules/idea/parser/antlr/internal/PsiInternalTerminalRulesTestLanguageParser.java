package org.eclipse.xtext.parser.terminalrules.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.eclipse.xtext.parser.terminalrules.idea.lang.TerminalRulesTestLanguageElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.terminalrules.services.TerminalRulesTestLanguageGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PsiInternalTerminalRulesTestLanguageParser extends AbstractPsiAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_RICH_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "RULE_ESCAPED_CHAR", "RULE_IN_RICH_STRING"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_RICH_STRING=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=5;
    public static final int RULE_WS=10;
    public static final int RULE_ESCAPED_CHAR=12;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_IN_RICH_STRING=13;
    public static final int RULE_ML_COMMENT=8;

    // delegates
    // delegators


        public PsiInternalTerminalRulesTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalTerminalRulesTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalTerminalRulesTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g"; }



    private TerminalRulesTestLanguageGrammarAccess grammarAccess;

    private TerminalRulesTestLanguageElementTypeProvider elementTypeProvider;

    public PsiInternalTerminalRulesTestLanguageParser(PsiBuilder builder, TokenStream input, TokenTypeProvider tokenTypeProvider, TerminalRulesTestLanguageElementTypeProvider elementTypeProvider, TerminalRulesTestLanguageGrammarAccess grammarAccess) {
    	super(builder, input, tokenTypeProvider);
        this.grammarAccess = grammarAccess;
    	this.elementTypeProvider = elementTypeProvider;
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
    }




    // $ANTLR start "entryRuleModel"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:49:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:49:15: ( ruleModel EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:50:2: ruleModel EOF
            {
             markComposite(elementTypeProvider.getModelElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel54);
            ruleModel();

            state._fsp--;

             doneComposite(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel60); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {


        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:58:1: ruleModel : ( ( (lv_idValue_0_0= RULE_ID ) ) | ( (lv_intValue_1_0= RULE_INT ) ) | ( (lv_stringValue_2_0= RULE_STRING ) ) | ( (lv_richStringValue_3_0= RULE_RICH_STRING ) ) | ( (lv_mlCommentValue_4_0= RULE_ML_COMMENT ) ) | ( (lv_slCommentValue_5_0= RULE_SL_COMMENT ) ) | ( (lv_wsValue_6_0= RULE_WS ) ) | ( (lv_anyValue_7_0= RULE_ANY_OTHER ) ) ) ;
    public final void ruleModel() throws RecognitionException {
        Token lv_idValue_0_0=null;
        Token lv_intValue_1_0=null;
        Token lv_stringValue_2_0=null;
        Token lv_richStringValue_3_0=null;
        Token lv_mlCommentValue_4_0=null;
        Token lv_slCommentValue_5_0=null;
        Token lv_wsValue_6_0=null;
        Token lv_anyValue_7_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:58:10: ( ( ( (lv_idValue_0_0= RULE_ID ) ) | ( (lv_intValue_1_0= RULE_INT ) ) | ( (lv_stringValue_2_0= RULE_STRING ) ) | ( (lv_richStringValue_3_0= RULE_RICH_STRING ) ) | ( (lv_mlCommentValue_4_0= RULE_ML_COMMENT ) ) | ( (lv_slCommentValue_5_0= RULE_SL_COMMENT ) ) | ( (lv_wsValue_6_0= RULE_WS ) ) | ( (lv_anyValue_7_0= RULE_ANY_OTHER ) ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:59:2: ( ( (lv_idValue_0_0= RULE_ID ) ) | ( (lv_intValue_1_0= RULE_INT ) ) | ( (lv_stringValue_2_0= RULE_STRING ) ) | ( (lv_richStringValue_3_0= RULE_RICH_STRING ) ) | ( (lv_mlCommentValue_4_0= RULE_ML_COMMENT ) ) | ( (lv_slCommentValue_5_0= RULE_SL_COMMENT ) ) | ( (lv_wsValue_6_0= RULE_WS ) ) | ( (lv_anyValue_7_0= RULE_ANY_OTHER ) ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:59:2: ( ( (lv_idValue_0_0= RULE_ID ) ) | ( (lv_intValue_1_0= RULE_INT ) ) | ( (lv_stringValue_2_0= RULE_STRING ) ) | ( (lv_richStringValue_3_0= RULE_RICH_STRING ) ) | ( (lv_mlCommentValue_4_0= RULE_ML_COMMENT ) ) | ( (lv_slCommentValue_5_0= RULE_SL_COMMENT ) ) | ( (lv_wsValue_6_0= RULE_WS ) ) | ( (lv_anyValue_7_0= RULE_ANY_OTHER ) ) )
            int alt1=8;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt1=1;
                }
                break;
            case RULE_INT:
                {
                alt1=2;
                }
                break;
            case RULE_STRING:
                {
                alt1=3;
                }
                break;
            case RULE_RICH_STRING:
                {
                alt1=4;
                }
                break;
            case RULE_ML_COMMENT:
                {
                alt1=5;
                }
                break;
            case RULE_SL_COMMENT:
                {
                alt1=6;
                }
                break;
            case RULE_WS:
                {
                alt1=7;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt1=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:60:3: ( (lv_idValue_0_0= RULE_ID ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:60:3: ( (lv_idValue_0_0= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:61:4: (lv_idValue_0_0= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:61:4: (lv_idValue_0_0= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:62:5: lv_idValue_0_0= RULE_ID
                    {

                    					markLeaf();
                    				
                    lv_idValue_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleModel96); 

                    					doneLeaf(lv_idValue_0_0, elementTypeProvider.getModel_IdValueIDTerminalRuleCall_0_0ElementType());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:72:3: ( (lv_intValue_1_0= RULE_INT ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:72:3: ( (lv_intValue_1_0= RULE_INT ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:73:4: (lv_intValue_1_0= RULE_INT )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:73:4: (lv_intValue_1_0= RULE_INT )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:74:5: lv_intValue_1_0= RULE_INT
                    {

                    					markLeaf();
                    				
                    lv_intValue_1_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleModel142); 

                    					doneLeaf(lv_intValue_1_0, elementTypeProvider.getModel_IntValueINTTerminalRuleCall_1_0ElementType());
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:84:3: ( (lv_stringValue_2_0= RULE_STRING ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:84:3: ( (lv_stringValue_2_0= RULE_STRING ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:85:4: (lv_stringValue_2_0= RULE_STRING )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:85:4: (lv_stringValue_2_0= RULE_STRING )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:86:5: lv_stringValue_2_0= RULE_STRING
                    {

                    					markLeaf();
                    				
                    lv_stringValue_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleModel188); 

                    					doneLeaf(lv_stringValue_2_0, elementTypeProvider.getModel_StringValueSTRINGTerminalRuleCall_2_0ElementType());
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:96:3: ( (lv_richStringValue_3_0= RULE_RICH_STRING ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:96:3: ( (lv_richStringValue_3_0= RULE_RICH_STRING ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:97:4: (lv_richStringValue_3_0= RULE_RICH_STRING )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:97:4: (lv_richStringValue_3_0= RULE_RICH_STRING )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:98:5: lv_richStringValue_3_0= RULE_RICH_STRING
                    {

                    					markLeaf();
                    				
                    lv_richStringValue_3_0=(Token)match(input,RULE_RICH_STRING,FollowSets000.FOLLOW_RULE_RICH_STRING_in_ruleModel234); 

                    					doneLeaf(lv_richStringValue_3_0, elementTypeProvider.getModel_RichStringValueRICH_STRINGTerminalRuleCall_3_0ElementType());
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:108:3: ( (lv_mlCommentValue_4_0= RULE_ML_COMMENT ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:108:3: ( (lv_mlCommentValue_4_0= RULE_ML_COMMENT ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:109:4: (lv_mlCommentValue_4_0= RULE_ML_COMMENT )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:109:4: (lv_mlCommentValue_4_0= RULE_ML_COMMENT )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:110:5: lv_mlCommentValue_4_0= RULE_ML_COMMENT
                    {

                    					markLeaf();
                    				
                    lv_mlCommentValue_4_0=(Token)match(input,RULE_ML_COMMENT,FollowSets000.FOLLOW_RULE_ML_COMMENT_in_ruleModel280); 

                    					doneLeaf(lv_mlCommentValue_4_0, elementTypeProvider.getModel_MlCommentValueML_COMMENTTerminalRuleCall_4_0ElementType());
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:120:3: ( (lv_slCommentValue_5_0= RULE_SL_COMMENT ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:120:3: ( (lv_slCommentValue_5_0= RULE_SL_COMMENT ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:121:4: (lv_slCommentValue_5_0= RULE_SL_COMMENT )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:121:4: (lv_slCommentValue_5_0= RULE_SL_COMMENT )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:122:5: lv_slCommentValue_5_0= RULE_SL_COMMENT
                    {

                    					markLeaf();
                    				
                    lv_slCommentValue_5_0=(Token)match(input,RULE_SL_COMMENT,FollowSets000.FOLLOW_RULE_SL_COMMENT_in_ruleModel326); 

                    					doneLeaf(lv_slCommentValue_5_0, elementTypeProvider.getModel_SlCommentValueSL_COMMENTTerminalRuleCall_5_0ElementType());
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:132:3: ( (lv_wsValue_6_0= RULE_WS ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:132:3: ( (lv_wsValue_6_0= RULE_WS ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:133:4: (lv_wsValue_6_0= RULE_WS )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:133:4: (lv_wsValue_6_0= RULE_WS )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:134:5: lv_wsValue_6_0= RULE_WS
                    {

                    					markLeaf();
                    				
                    lv_wsValue_6_0=(Token)match(input,RULE_WS,FollowSets000.FOLLOW_RULE_WS_in_ruleModel372); 

                    					doneLeaf(lv_wsValue_6_0, elementTypeProvider.getModel_WsValueWSTerminalRuleCall_6_0ElementType());
                    				

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:144:3: ( (lv_anyValue_7_0= RULE_ANY_OTHER ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:144:3: ( (lv_anyValue_7_0= RULE_ANY_OTHER ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:145:4: (lv_anyValue_7_0= RULE_ANY_OTHER )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:145:4: (lv_anyValue_7_0= RULE_ANY_OTHER )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/terminalrules/idea/parser/antlr/internal/PsiInternalTerminalRulesTestLanguage.g:146:5: lv_anyValue_7_0= RULE_ANY_OTHER
                    {

                    					markLeaf();
                    				
                    lv_anyValue_7_0=(Token)match(input,RULE_ANY_OTHER,FollowSets000.FOLLOW_RULE_ANY_OTHER_in_ruleModel418); 

                    					doneLeaf(lv_anyValue_7_0, elementTypeProvider.getModel_AnyValueANY_OTHERTerminalRuleCall_7_0ElementType());
                    				

                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleModel"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel54 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel60 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleModel96 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleModel142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleModel188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_RICH_STRING_in_ruleModel234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleModel280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleModel326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_WS_in_ruleModel372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleModel418 = new BitSet(new long[]{0x0000000000000002L});
    }


}