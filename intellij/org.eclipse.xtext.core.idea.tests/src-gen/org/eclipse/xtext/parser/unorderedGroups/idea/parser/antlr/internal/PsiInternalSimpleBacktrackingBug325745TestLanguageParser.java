package org.eclipse.xtext.parser.unorderedGroups.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.eclipse.xtext.parser.unorderedGroups.idea.lang.SimpleBacktrackingBug325745TestLanguageElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.IUnorderedGroupHelper.UnorderedGroupState;
import org.eclipse.xtext.parser.unorderedGroups.services.SimpleBacktrackingBug325745TestLanguageGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class PsiInternalSimpleBacktrackingBug325745TestLanguageParser extends AbstractPsiAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "':='", "'['", "']'", "'*'", "'!'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public PsiInternalSimpleBacktrackingBug325745TestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalSimpleBacktrackingBug325745TestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalSimpleBacktrackingBug325745TestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

    private SimpleBacktrackingBug325745TestLanguageGrammarAccess grammarAccess;

    private SimpleBacktrackingBug325745TestLanguageElementTypeProvider elementTypeProvider;

    public PsiInternalSimpleBacktrackingBug325745TestLanguageParser(PsiBuilder builder, TokenStream input, TokenTypeProvider tokenTypeProvider, SimpleBacktrackingBug325745TestLanguageElementTypeProvider elementTypeProvider, SimpleBacktrackingBug325745TestLanguageGrammarAccess grammarAccess) {
    	super(builder, input, tokenTypeProvider);
        this.grammarAccess = grammarAccess;
    	this.elementTypeProvider = elementTypeProvider;
    }

    @Override
    protected String getFirstRuleName() {
    	return "DelegateModel";
    }




    // $ANTLR start "entryRuleDelegateModel"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:56:1: entryRuleDelegateModel : ruleDelegateModel EOF ;
    public final void entryRuleDelegateModel() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:56:23: ( ruleDelegateModel EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:57:2: ruleDelegateModel EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getDelegateModelElementType()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDelegateModel_in_entryRuleDelegateModel60);
            ruleDelegateModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               doneComposite(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDelegateModel66); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDelegateModel"


    // $ANTLR start "ruleDelegateModel"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:65:1: ruleDelegateModel : ruleModel ;
    public final void ruleDelegateModel() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:65:18: ( ruleModel )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:66:2: ruleModel
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		markComposite(elementTypeProvider.getDelegateModel_ModelParserRuleCallElementType());
              	
            }
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_ruleDelegateModel85);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {

              		doneComposite();
              	
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
    // $ANTLR end "ruleDelegateModel"


    // $ANTLR start "entryRuleModel"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:79:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:79:15: ( ruleModel EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:80:2: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getModelElementType()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel101);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               doneComposite(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel107); if (state.failed) return ;

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
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:88:1: ruleModel : ( () ( (lv_fields_1_0= ruleElement ) )+ ) ;
    public final void ruleModel() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:88:10: ( ( () ( (lv_fields_1_0= ruleElement ) )+ ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:89:2: ( () ( (lv_fields_1_0= ruleElement ) )+ )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:89:2: ( () ( (lv_fields_1_0= ruleElement ) )+ )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:90:3: () ( (lv_fields_1_0= ruleElement ) )+
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:90:3: ()
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:91:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getModel_ModelAction_0ElementType());
              				doneComposite();
              			
            }

            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:99:3: ( (lv_fields_1_0= ruleElement ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:100:4: (lv_fields_1_0= ruleElement )
            	    {
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:100:4: (lv_fields_1_0= ruleElement )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:101:5: lv_fields_1_0= ruleElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					markComposite(elementTypeProvider.getModel_FieldsElementParserRuleCall_1_0ElementType());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleElement_in_ruleModel161);
            	    ruleElement();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    if ( state.backtracking==0 ) {

            	      					doneComposite();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


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


    // $ANTLR start "entryRuleElement"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:114:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:114:17: ( ruleElement EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:115:2: ruleElement EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getElementElementType()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleElement_in_entryRuleElement193);
            ruleElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               doneComposite(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElement199); if (state.failed) return ;

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:123:1: ruleElement : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dataType_1_0= ruleDataType ) )? ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= '.' ) ;
    public final void ruleElement() throws RecognitionException {
        Token lv_name_0_0=null;
        Token otherlv_3=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:123:12: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dataType_1_0= ruleDataType ) )? ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= '.' ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:124:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dataType_1_0= ruleDataType ) )? ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= '.' )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:124:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_dataType_1_0= ruleDataType ) )? ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= '.' )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:125:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_dataType_1_0= ruleDataType ) )? ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= '.'
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:125:3: ( (lv_name_0_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:126:4: (lv_name_0_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:126:4: (lv_name_0_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:127:5: lv_name_0_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					markLeaf();
              				
            }
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleElement235); if (state.failed) return ;
            if ( state.backtracking==0 ) {

              					doneLeaf(lv_name_0_0, elementTypeProvider.getElement_NameIDTerminalRuleCall_0_0ElementType());
              				
            }

            }


            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:136:3: ( (lv_dataType_1_0= ruleDataType ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (synpred2_PsiInternalSimpleBacktrackingBug325745TestLanguage()) ) {
                    alt2=1;
                }
            }
            switch (alt2) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:137:4: (lv_dataType_1_0= ruleDataType )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:137:4: (lv_dataType_1_0= ruleDataType )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:138:5: lv_dataType_1_0= ruleDataType
                    {
                    if ( state.backtracking==0 ) {

                      					markComposite(elementTypeProvider.getElement_DataTypeDataTypeParserRuleCall_1_0ElementType());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDataType_in_ruleElement273);
                    ruleDataType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                      					doneComposite();
                      				
                    }

                    }


                    }
                    break;

            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:147:3: ( (lv_expression_2_0= ruleExpression ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:148:4: (lv_expression_2_0= ruleExpression )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:148:4: (lv_expression_2_0= ruleExpression )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:149:5: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getElement_ExpressionExpressionParserRuleCall_2_0ElementType());
              				
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleElement312);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {

              					doneComposite();
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			markLeaf();
              		
            }
            otherlv_3=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleElement337); if (state.failed) return ;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_3, elementTypeProvider.getElement_FullStopKeyword_3ElementType());
              		
            }

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleDataType"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:169:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:169:18: ( ruleDataType EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:170:2: ruleDataType EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getDataTypeElementType()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDataType_in_entryRuleDataType357);
            ruleDataType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               doneComposite(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDataType363); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:178:1: ruleDataType : ( ( (lv_baseType_0_0= RULE_ID ) ) (otherlv_1= ':=' ( (lv_defaultValue_2_0= RULE_STRING ) ) )? ) ;
    public final void ruleDataType() throws RecognitionException {
        Token lv_baseType_0_0=null;
        Token otherlv_1=null;
        Token lv_defaultValue_2_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:178:13: ( ( ( (lv_baseType_0_0= RULE_ID ) ) (otherlv_1= ':=' ( (lv_defaultValue_2_0= RULE_STRING ) ) )? ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:179:2: ( ( (lv_baseType_0_0= RULE_ID ) ) (otherlv_1= ':=' ( (lv_defaultValue_2_0= RULE_STRING ) ) )? )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:179:2: ( ( (lv_baseType_0_0= RULE_ID ) ) (otherlv_1= ':=' ( (lv_defaultValue_2_0= RULE_STRING ) ) )? )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:180:3: ( (lv_baseType_0_0= RULE_ID ) ) (otherlv_1= ':=' ( (lv_defaultValue_2_0= RULE_STRING ) ) )?
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:180:3: ( (lv_baseType_0_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:181:4: (lv_baseType_0_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:181:4: (lv_baseType_0_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:182:5: lv_baseType_0_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					markLeaf();
              				
            }
            lv_baseType_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDataType399); if (state.failed) return ;
            if ( state.backtracking==0 ) {

              					doneLeaf(lv_baseType_0_0, elementTypeProvider.getDataType_BaseTypeIDTerminalRuleCall_0_0ElementType());
              				
            }

            }


            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:191:3: (otherlv_1= ':=' ( (lv_defaultValue_2_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:192:4: otherlv_1= ':=' ( (lv_defaultValue_2_0= RULE_STRING ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf();
                      			
                    }
                    otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDataType430); if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_1, elementTypeProvider.getDataType_ColonEqualsSignKeyword_1_0ElementType());
                      			
                    }
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:199:4: ( (lv_defaultValue_2_0= RULE_STRING ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:200:5: (lv_defaultValue_2_0= RULE_STRING )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:200:5: (lv_defaultValue_2_0= RULE_STRING )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:201:6: lv_defaultValue_2_0= RULE_STRING
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf();
                      					
                    }
                    lv_defaultValue_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleDataType462); if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_defaultValue_2_0, elementTypeProvider.getDataType_DefaultValueSTRINGTerminalRuleCall_1_1_0ElementType());
                      					
                    }

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleExpression"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:215:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {

        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getExpressionAccess().getUnorderedGroup_1(), 
        	grammarAccess.getExpressionAccess().getUnorderedGroup_3()
        	);

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:221:2: ( ruleExpression EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:222:2: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getExpressionElementType()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression506);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               doneComposite(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression512); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myUnorderedGroupState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:231:1: ruleExpression : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= '[' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) ) )* ) ) ) ( (otherlv_4= '[' )? ( (lv_terms_5_0= ruleSimpleTerm ) ) (otherlv_6= ']' )? )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ']' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) ) )* ) ) ) ) ;
    public final void ruleExpression() throws RecognitionException {
        Token otherlv_2=null;
        Token lv_prefix_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_postfix_9_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:231:15: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= '[' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) ) )* ) ) ) ( (otherlv_4= '[' )? ( (lv_terms_5_0= ruleSimpleTerm ) ) (otherlv_6= ']' )? )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ']' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) ) )* ) ) ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:232:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= '[' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) ) )* ) ) ) ( (otherlv_4= '[' )? ( (lv_terms_5_0= ruleSimpleTerm ) ) (otherlv_6= ']' )? )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ']' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) ) )* ) ) ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:232:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= '[' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) ) )* ) ) ) ( (otherlv_4= '[' )? ( (lv_terms_5_0= ruleSimpleTerm ) ) (otherlv_6= ']' )? )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ']' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) ) )* ) ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:233:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= '[' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) ) )* ) ) ) ( (otherlv_4= '[' )? ( (lv_terms_5_0= ruleSimpleTerm ) ) (otherlv_6= ']' )? )* ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ']' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) ) )* ) ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:233:3: ()
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:234:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getExpression_ExpressionAction_0ElementType());
              				doneComposite();
              			
            }

            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:242:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= '[' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) ) )* ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:243:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= '[' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) ) )* ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:243:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= '[' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) ) )* ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:244:5: ( ( ({...}? => ( ({...}? => (otherlv_2= '[' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getExpressionAccess().getUnorderedGroup_1());
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:247:5: ( ( ({...}? => ( ({...}? => (otherlv_2= '[' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) ) )* )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:248:6: ( ({...}? => ( ({...}? => (otherlv_2= '[' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) ) )*
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:248:6: ( ({...}? => ( ({...}? => (otherlv_2= '[' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    int LA4_1 = input.LA(2);

                    if ( synpred4_PsiInternalSimpleBacktrackingBug325745TestLanguage() && getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_1(), 0) ) {
                        alt4=1;
                    }


                }
                else if ( (LA4_0==RULE_STRING) ) {
                    int LA4_3 = input.LA(2);

                    if ( synpred5_PsiInternalSimpleBacktrackingBug325745TestLanguage() && getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_1(), 1) ) {
                        alt4=2;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:249:4: ({...}? => ( ({...}? => (otherlv_2= '[' ) ) ) )
            	    {
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:249:4: ({...}? => ( ({...}? => (otherlv_2= '[' ) ) ) )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:250:5: {...}? => ( ({...}? => (otherlv_2= '[' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        throw new FailedPredicateException(input, "ruleExpression", "getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:250:107: ( ({...}? => (otherlv_2= '[' ) ) )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:251:6: ({...}? => (otherlv_2= '[' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getExpressionAccess().getUnorderedGroup_1(), 0);
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:254:9: ({...}? => (otherlv_2= '[' ) )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:254:10: {...}? => (otherlv_2= '[' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        throw new FailedPredicateException(input, "ruleExpression", "true");
            	    }
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:254:19: (otherlv_2= '[' )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:254:20: otherlv_2= '['
            	    {
            	    if ( state.backtracking==0 ) {

            	      									markLeaf();
            	      								
            	    }
            	    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleExpression617); if (state.failed) return ;
            	    if ( state.backtracking==0 ) {

            	      									doneLeaf(otherlv_2, elementTypeProvider.getExpression_LeftSquareBracketKeyword_1_0ElementType());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExpressionAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:267:4: ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) )
            	    {
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:267:4: ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:268:5: {...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        throw new FailedPredicateException(input, "ruleExpression", "getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:268:107: ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:269:6: ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getExpressionAccess().getUnorderedGroup_1(), 1);
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:272:9: ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:272:10: {...}? => ( (lv_prefix_3_0= RULE_STRING ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        throw new FailedPredicateException(input, "ruleExpression", "true");
            	    }
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:272:19: ( (lv_prefix_3_0= RULE_STRING ) )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:272:20: (lv_prefix_3_0= RULE_STRING )
            	    {
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:272:20: (lv_prefix_3_0= RULE_STRING )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:273:10: lv_prefix_3_0= RULE_STRING
            	    {
            	    if ( state.backtracking==0 ) {

            	      										markLeaf();
            	      									
            	    }
            	    lv_prefix_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleExpression715); if (state.failed) return ;
            	    if ( state.backtracking==0 ) {

            	      										doneLeaf(lv_prefix_3_0, elementTypeProvider.getExpression_PrefixSTRINGTerminalRuleCall_1_1_0ElementType());
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExpressionAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getExpressionAccess().getUnorderedGroup_1());

            }

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:294:3: ( (otherlv_4= '[' )? ( (lv_terms_5_0= ruleSimpleTerm ) ) (otherlv_6= ']' )? )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==RULE_INT||LA7_0==13) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:295:4: (otherlv_4= '[' )? ( (lv_terms_5_0= ruleSimpleTerm ) ) (otherlv_6= ']' )?
            	    {
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:295:4: (otherlv_4= '[' )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==13) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:296:5: otherlv_4= '['
            	            {
            	            if ( state.backtracking==0 ) {

            	              					markLeaf();
            	              				
            	            }
            	            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleExpression817); if (state.failed) return ;
            	            if ( state.backtracking==0 ) {

            	              					doneLeaf(otherlv_4, elementTypeProvider.getExpression_LeftSquareBracketKeyword_2_0ElementType());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:304:4: ( (lv_terms_5_0= ruleSimpleTerm ) )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:305:5: (lv_terms_5_0= ruleSimpleTerm )
            	    {
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:305:5: (lv_terms_5_0= ruleSimpleTerm )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:306:6: lv_terms_5_0= ruleSimpleTerm
            	    {
            	    if ( state.backtracking==0 ) {

            	      						markComposite(elementTypeProvider.getExpression_TermsSimpleTermParserRuleCall_2_1_0ElementType());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSimpleTerm_in_ruleExpression856);
            	    ruleSimpleTerm();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    if ( state.backtracking==0 ) {

            	      						doneComposite();
            	      					
            	    }

            	    }


            	    }

            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:315:4: (otherlv_6= ']' )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==14) ) {
            	        int LA6_1 = input.LA(2);

            	        if ( (synpred7_PsiInternalSimpleBacktrackingBug325745TestLanguage()) ) {
            	            alt6=1;
            	        }
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:316:5: otherlv_6= ']'
            	            {
            	            if ( state.backtracking==0 ) {

            	              					markLeaf();
            	              				
            	            }
            	            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleExpression893); if (state.failed) return ;
            	            if ( state.backtracking==0 ) {

            	              					doneLeaf(otherlv_6, elementTypeProvider.getExpression_RightSquareBracketKeyword_2_2ElementType());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:325:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ']' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) ) )* ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:326:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= ']' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) ) )* ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:326:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= ']' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) ) )* ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:327:5: ( ( ({...}? => ( ({...}? => (otherlv_8= ']' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getExpressionAccess().getUnorderedGroup_3());
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:330:5: ( ( ({...}? => ( ({...}? => (otherlv_8= ']' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) ) )* )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:331:6: ( ({...}? => ( ({...}? => (otherlv_8= ']' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) ) )*
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:331:6: ( ({...}? => ( ({...}? => (otherlv_8= ']' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( LA8_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_3(), 0) ) {
                    alt8=1;
                }
                else if ( LA8_0 ==RULE_STRING && getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_3(), 1) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:332:4: ({...}? => ( ({...}? => (otherlv_8= ']' ) ) ) )
            	    {
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:332:4: ({...}? => ( ({...}? => (otherlv_8= ']' ) ) ) )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:333:5: {...}? => ( ({...}? => (otherlv_8= ']' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_3(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        throw new FailedPredicateException(input, "ruleExpression", "getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:333:107: ( ({...}? => (otherlv_8= ']' ) ) )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:334:6: ({...}? => (otherlv_8= ']' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getExpressionAccess().getUnorderedGroup_3(), 0);
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:337:9: ({...}? => (otherlv_8= ']' ) )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:337:10: {...}? => (otherlv_8= ']' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        throw new FailedPredicateException(input, "ruleExpression", "true");
            	    }
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:337:19: (otherlv_8= ']' )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:337:20: otherlv_8= ']'
            	    {
            	    if ( state.backtracking==0 ) {

            	      									markLeaf();
            	      								
            	    }
            	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleExpression984); if (state.failed) return ;
            	    if ( state.backtracking==0 ) {

            	      									doneLeaf(otherlv_8, elementTypeProvider.getExpression_RightSquareBracketKeyword_3_0ElementType());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExpressionAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:350:4: ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) )
            	    {
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:350:4: ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:351:5: {...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_3(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        throw new FailedPredicateException(input, "ruleExpression", "getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:351:107: ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:352:6: ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getExpressionAccess().getUnorderedGroup_3(), 1);
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:355:9: ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:355:10: {...}? => ( (lv_postfix_9_0= RULE_STRING ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        throw new FailedPredicateException(input, "ruleExpression", "true");
            	    }
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:355:19: ( (lv_postfix_9_0= RULE_STRING ) )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:355:20: (lv_postfix_9_0= RULE_STRING )
            	    {
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:355:20: (lv_postfix_9_0= RULE_STRING )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:356:10: lv_postfix_9_0= RULE_STRING
            	    {
            	    if ( state.backtracking==0 ) {

            	      										markLeaf();
            	      									
            	    }
            	    lv_postfix_9_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleExpression1082); if (state.failed) return ;
            	    if ( state.backtracking==0 ) {

            	      										doneLeaf(lv_postfix_9_0, elementTypeProvider.getExpression_PostfixSTRINGTerminalRuleCall_3_1_0ElementType());
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExpressionAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getExpressionAccess().getUnorderedGroup_3());

            }


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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleSimpleTerm"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:381:1: entryRuleSimpleTerm : ruleSimpleTerm EOF ;
    public final void entryRuleSimpleTerm() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:381:20: ( ruleSimpleTerm EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:382:2: ruleSimpleTerm EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getSimpleTermElementType()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSimpleTerm_in_entryRuleSimpleTerm1177);
            ruleSimpleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               doneComposite(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSimpleTerm1183); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSimpleTerm"


    // $ANTLR start "ruleSimpleTerm"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:390:1: ruleSimpleTerm : ( ( ( (lv_lineCount_0_0= RULE_INT ) ) (otherlv_1= '*' )? ( (lv_charCount_2_0= RULE_INT ) )? (otherlv_3= '!' )? ( (lv_charSet_4_0= RULE_ID ) )? ) | ( (lv_refChar_5_0= RULE_ID ) ) ) ;
    public final void ruleSimpleTerm() throws RecognitionException {
        Token lv_lineCount_0_0=null;
        Token otherlv_1=null;
        Token lv_charCount_2_0=null;
        Token otherlv_3=null;
        Token lv_charSet_4_0=null;
        Token lv_refChar_5_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:390:15: ( ( ( ( (lv_lineCount_0_0= RULE_INT ) ) (otherlv_1= '*' )? ( (lv_charCount_2_0= RULE_INT ) )? (otherlv_3= '!' )? ( (lv_charSet_4_0= RULE_ID ) )? ) | ( (lv_refChar_5_0= RULE_ID ) ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:391:2: ( ( ( (lv_lineCount_0_0= RULE_INT ) ) (otherlv_1= '*' )? ( (lv_charCount_2_0= RULE_INT ) )? (otherlv_3= '!' )? ( (lv_charSet_4_0= RULE_ID ) )? ) | ( (lv_refChar_5_0= RULE_ID ) ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:391:2: ( ( ( (lv_lineCount_0_0= RULE_INT ) ) (otherlv_1= '*' )? ( (lv_charCount_2_0= RULE_INT ) )? (otherlv_3= '!' )? ( (lv_charSet_4_0= RULE_ID ) )? ) | ( (lv_refChar_5_0= RULE_ID ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:392:3: ( ( (lv_lineCount_0_0= RULE_INT ) ) (otherlv_1= '*' )? ( (lv_charCount_2_0= RULE_INT ) )? (otherlv_3= '!' )? ( (lv_charSet_4_0= RULE_ID ) )? )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:392:3: ( ( (lv_lineCount_0_0= RULE_INT ) ) (otherlv_1= '*' )? ( (lv_charCount_2_0= RULE_INT ) )? (otherlv_3= '!' )? ( (lv_charSet_4_0= RULE_ID ) )? )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:393:4: ( (lv_lineCount_0_0= RULE_INT ) ) (otherlv_1= '*' )? ( (lv_charCount_2_0= RULE_INT ) )? (otherlv_3= '!' )? ( (lv_charSet_4_0= RULE_ID ) )?
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:393:4: ( (lv_lineCount_0_0= RULE_INT ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:394:5: (lv_lineCount_0_0= RULE_INT )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:394:5: (lv_lineCount_0_0= RULE_INT )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:395:6: lv_lineCount_0_0= RULE_INT
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf();
                      					
                    }
                    lv_lineCount_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleSimpleTerm1227); if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_lineCount_0_0, elementTypeProvider.getSimpleTerm_LineCountINTTerminalRuleCall_0_0_0ElementType());
                      					
                    }

                    }


                    }

                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:404:4: (otherlv_1= '*' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==15) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:405:5: otherlv_1= '*'
                            {
                            if ( state.backtracking==0 ) {

                              					markLeaf();
                              				
                            }
                            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSimpleTerm1264); if (state.failed) return ;
                            if ( state.backtracking==0 ) {

                              					doneLeaf(otherlv_1, elementTypeProvider.getSimpleTerm_AsteriskKeyword_0_1ElementType());
                              				
                            }

                            }
                            break;

                    }

                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:413:4: ( (lv_charCount_2_0= RULE_INT ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_INT) ) {
                        int LA10_1 = input.LA(2);

                        if ( (synpred12_PsiInternalSimpleBacktrackingBug325745TestLanguage()) ) {
                            alt10=1;
                        }
                    }
                    switch (alt10) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:414:5: (lv_charCount_2_0= RULE_INT )
                            {
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:414:5: (lv_charCount_2_0= RULE_INT )
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:415:6: lv_charCount_2_0= RULE_INT
                            {
                            if ( state.backtracking==0 ) {

                              						markLeaf();
                              					
                            }
                            lv_charCount_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleSimpleTerm1303); if (state.failed) return ;
                            if ( state.backtracking==0 ) {

                              						doneLeaf(lv_charCount_2_0, elementTypeProvider.getSimpleTerm_CharCountINTTerminalRuleCall_0_2_0ElementType());
                              					
                            }

                            }


                            }
                            break;

                    }

                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:424:4: (otherlv_3= '!' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==16) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:425:5: otherlv_3= '!'
                            {
                            if ( state.backtracking==0 ) {

                              					markLeaf();
                              				
                            }
                            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSimpleTerm1341); if (state.failed) return ;
                            if ( state.backtracking==0 ) {

                              					doneLeaf(otherlv_3, elementTypeProvider.getSimpleTerm_ExclamationMarkKeyword_0_3ElementType());
                              				
                            }

                            }
                            break;

                    }

                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:433:4: ( (lv_charSet_4_0= RULE_ID ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_ID) ) {
                        int LA12_1 = input.LA(2);

                        if ( (synpred14_PsiInternalSimpleBacktrackingBug325745TestLanguage()) ) {
                            alt12=1;
                        }
                    }
                    switch (alt12) {
                        case 1 :
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:434:5: (lv_charSet_4_0= RULE_ID )
                            {
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:434:5: (lv_charSet_4_0= RULE_ID )
                            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:435:6: lv_charSet_4_0= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              						markLeaf();
                              					
                            }
                            lv_charSet_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSimpleTerm1380); if (state.failed) return ;
                            if ( state.backtracking==0 ) {

                              						doneLeaf(lv_charSet_4_0, elementTypeProvider.getSimpleTerm_CharSetIDTerminalRuleCall_0_4_0ElementType());
                              					
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:446:3: ( (lv_refChar_5_0= RULE_ID ) )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:446:3: ( (lv_refChar_5_0= RULE_ID ) )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:447:4: (lv_refChar_5_0= RULE_ID )
                    {
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:447:4: (lv_refChar_5_0= RULE_ID )
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:448:5: lv_refChar_5_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      					markLeaf();
                      				
                    }
                    lv_refChar_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSimpleTerm1434); if (state.failed) return ;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(lv_refChar_5_0, elementTypeProvider.getSimpleTerm_RefCharIDTerminalRuleCall_1_0ElementType());
                      				
                    }

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
    // $ANTLR end "ruleSimpleTerm"

    // $ANTLR start synpred2_PsiInternalSimpleBacktrackingBug325745TestLanguage
    public final void synpred2_PsiInternalSimpleBacktrackingBug325745TestLanguage_fragment() throws RecognitionException {   
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:137:4: ( (lv_dataType_1_0= ruleDataType ) )
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:137:4: (lv_dataType_1_0= ruleDataType )
        {
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:137:4: (lv_dataType_1_0= ruleDataType )
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:138:5: lv_dataType_1_0= ruleDataType
        {
        if ( state.backtracking==0 ) {

          					markComposite(elementTypeProvider.getElement_DataTypeDataTypeParserRuleCall_1_0ElementType());
          				
        }
        pushFollow(FollowSets000.FOLLOW_ruleDataType_in_synpred2_PsiInternalSimpleBacktrackingBug325745TestLanguage273);
        ruleDataType();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_PsiInternalSimpleBacktrackingBug325745TestLanguage

    // $ANTLR start synpred4_PsiInternalSimpleBacktrackingBug325745TestLanguage
    public final void synpred4_PsiInternalSimpleBacktrackingBug325745TestLanguage_fragment() throws RecognitionException {   
        Token otherlv_2=null;

        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:249:4: ( ({...}? => ( ({...}? => (otherlv_2= '[' ) ) ) ) )
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:249:4: ({...}? => ( ({...}? => (otherlv_2= '[' ) ) ) )
        {
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:249:4: ({...}? => ( ({...}? => (otherlv_2= '[' ) ) ) )
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:250:5: {...}? => ( ({...}? => (otherlv_2= '[' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_1(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred4_PsiInternalSimpleBacktrackingBug325745TestLanguage", "getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_1(), 0)");
        }
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:250:107: ( ({...}? => (otherlv_2= '[' ) ) )
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:251:6: ({...}? => (otherlv_2= '[' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getExpressionAccess().getUnorderedGroup_1(), 0);
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:254:9: ({...}? => (otherlv_2= '[' ) )
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:254:10: {...}? => (otherlv_2= '[' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred4_PsiInternalSimpleBacktrackingBug325745TestLanguage", "true");
        }
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:254:19: (otherlv_2= '[' )
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:254:20: otherlv_2= '['
        {
        if ( state.backtracking==0 ) {

          									markLeaf();
          								
        }
        otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_synpred4_PsiInternalSimpleBacktrackingBug325745TestLanguage617); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred4_PsiInternalSimpleBacktrackingBug325745TestLanguage

    // $ANTLR start synpred5_PsiInternalSimpleBacktrackingBug325745TestLanguage
    public final void synpred5_PsiInternalSimpleBacktrackingBug325745TestLanguage_fragment() throws RecognitionException {   
        Token lv_prefix_3_0=null;

        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:267:4: ( ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) ) )
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:267:4: ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) )
        {
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:267:4: ({...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) ) )
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:268:5: {...}? => ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_1(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred5_PsiInternalSimpleBacktrackingBug325745TestLanguage", "getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_1(), 1)");
        }
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:268:107: ( ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) ) )
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:269:6: ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getExpressionAccess().getUnorderedGroup_1(), 1);
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:272:9: ({...}? => ( (lv_prefix_3_0= RULE_STRING ) ) )
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:272:10: {...}? => ( (lv_prefix_3_0= RULE_STRING ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred5_PsiInternalSimpleBacktrackingBug325745TestLanguage", "true");
        }
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:272:19: ( (lv_prefix_3_0= RULE_STRING ) )
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:272:20: (lv_prefix_3_0= RULE_STRING )
        {
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:272:20: (lv_prefix_3_0= RULE_STRING )
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:273:10: lv_prefix_3_0= RULE_STRING
        {
        if ( state.backtracking==0 ) {

          										markLeaf();
          									
        }
        lv_prefix_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_synpred5_PsiInternalSimpleBacktrackingBug325745TestLanguage715); if (state.failed) return ;

        }


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred5_PsiInternalSimpleBacktrackingBug325745TestLanguage

    // $ANTLR start synpred7_PsiInternalSimpleBacktrackingBug325745TestLanguage
    public final void synpred7_PsiInternalSimpleBacktrackingBug325745TestLanguage_fragment() throws RecognitionException {   
        Token otherlv_6=null;

        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:316:5: (otherlv_6= ']' )
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:316:5: otherlv_6= ']'
        {
        if ( state.backtracking==0 ) {

          					markLeaf();
          				
        }
        otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_synpred7_PsiInternalSimpleBacktrackingBug325745TestLanguage893); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_PsiInternalSimpleBacktrackingBug325745TestLanguage

    // $ANTLR start synpred9_PsiInternalSimpleBacktrackingBug325745TestLanguage
    public final void synpred9_PsiInternalSimpleBacktrackingBug325745TestLanguage_fragment() throws RecognitionException {   
        Token otherlv_8=null;

        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:332:4: ( ({...}? => ( ({...}? => (otherlv_8= ']' ) ) ) ) )
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:332:4: ({...}? => ( ({...}? => (otherlv_8= ']' ) ) ) )
        {
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:332:4: ({...}? => ( ({...}? => (otherlv_8= ']' ) ) ) )
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:333:5: {...}? => ( ({...}? => (otherlv_8= ']' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred9_PsiInternalSimpleBacktrackingBug325745TestLanguage", "getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_3(), 0)");
        }
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:333:107: ( ({...}? => (otherlv_8= ']' ) ) )
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:334:6: ({...}? => (otherlv_8= ']' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getExpressionAccess().getUnorderedGroup_3(), 0);
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:337:9: ({...}? => (otherlv_8= ']' ) )
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:337:10: {...}? => (otherlv_8= ']' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred9_PsiInternalSimpleBacktrackingBug325745TestLanguage", "true");
        }
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:337:19: (otherlv_8= ']' )
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:337:20: otherlv_8= ']'
        {
        if ( state.backtracking==0 ) {

          									markLeaf();
          								
        }
        otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_synpred9_PsiInternalSimpleBacktrackingBug325745TestLanguage984); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred9_PsiInternalSimpleBacktrackingBug325745TestLanguage

    // $ANTLR start synpred10_PsiInternalSimpleBacktrackingBug325745TestLanguage
    public final void synpred10_PsiInternalSimpleBacktrackingBug325745TestLanguage_fragment() throws RecognitionException {   
        Token lv_postfix_9_0=null;

        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:350:4: ( ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) ) )
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:350:4: ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) )
        {
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:350:4: ({...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) ) )
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:351:5: {...}? => ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_3(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred10_PsiInternalSimpleBacktrackingBug325745TestLanguage", "getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionAccess().getUnorderedGroup_3(), 1)");
        }
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:351:107: ( ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) ) )
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:352:6: ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getExpressionAccess().getUnorderedGroup_3(), 1);
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:355:9: ({...}? => ( (lv_postfix_9_0= RULE_STRING ) ) )
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:355:10: {...}? => ( (lv_postfix_9_0= RULE_STRING ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred10_PsiInternalSimpleBacktrackingBug325745TestLanguage", "true");
        }
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:355:19: ( (lv_postfix_9_0= RULE_STRING ) )
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:355:20: (lv_postfix_9_0= RULE_STRING )
        {
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:355:20: (lv_postfix_9_0= RULE_STRING )
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:356:10: lv_postfix_9_0= RULE_STRING
        {
        if ( state.backtracking==0 ) {

          										markLeaf();
          									
        }
        lv_postfix_9_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_synpred10_PsiInternalSimpleBacktrackingBug325745TestLanguage1082); if (state.failed) return ;

        }


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred10_PsiInternalSimpleBacktrackingBug325745TestLanguage

    // $ANTLR start synpred12_PsiInternalSimpleBacktrackingBug325745TestLanguage
    public final void synpred12_PsiInternalSimpleBacktrackingBug325745TestLanguage_fragment() throws RecognitionException {   
        Token lv_charCount_2_0=null;

        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:414:5: ( (lv_charCount_2_0= RULE_INT ) )
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:414:5: (lv_charCount_2_0= RULE_INT )
        {
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:414:5: (lv_charCount_2_0= RULE_INT )
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:415:6: lv_charCount_2_0= RULE_INT
        {
        if ( state.backtracking==0 ) {

          						markLeaf();
          					
        }
        lv_charCount_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_synpred12_PsiInternalSimpleBacktrackingBug325745TestLanguage1303); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_PsiInternalSimpleBacktrackingBug325745TestLanguage

    // $ANTLR start synpred14_PsiInternalSimpleBacktrackingBug325745TestLanguage
    public final void synpred14_PsiInternalSimpleBacktrackingBug325745TestLanguage_fragment() throws RecognitionException {   
        Token lv_charSet_4_0=null;

        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:434:5: ( (lv_charSet_4_0= RULE_ID ) )
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:434:5: (lv_charSet_4_0= RULE_ID )
        {
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:434:5: (lv_charSet_4_0= RULE_ID )
        // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/parser/unorderedGroups/idea/parser/antlr/internal/PsiInternalSimpleBacktrackingBug325745TestLanguage.g:435:6: lv_charSet_4_0= RULE_ID
        {
        if ( state.backtracking==0 ) {

          						markLeaf();
          					
        }
        lv_charSet_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_synpred14_PsiInternalSimpleBacktrackingBug325745TestLanguage1380); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_PsiInternalSimpleBacktrackingBug325745TestLanguage

    // Delegated rules

    public final boolean synpred9_PsiInternalSimpleBacktrackingBug325745TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_PsiInternalSimpleBacktrackingBug325745TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_PsiInternalSimpleBacktrackingBug325745TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_PsiInternalSimpleBacktrackingBug325745TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_PsiInternalSimpleBacktrackingBug325745TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_PsiInternalSimpleBacktrackingBug325745TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_PsiInternalSimpleBacktrackingBug325745TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_PsiInternalSimpleBacktrackingBug325745TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_PsiInternalSimpleBacktrackingBug325745TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_PsiInternalSimpleBacktrackingBug325745TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_PsiInternalSimpleBacktrackingBug325745TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_PsiInternalSimpleBacktrackingBug325745TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_PsiInternalSimpleBacktrackingBug325745TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_PsiInternalSimpleBacktrackingBug325745TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_PsiInternalSimpleBacktrackingBug325745TestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_PsiInternalSimpleBacktrackingBug325745TestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleDelegateModel_in_entryRuleDelegateModel60 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDelegateModel66 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModel_in_ruleDelegateModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel101 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElement_in_ruleModel161 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_ruleElement_in_entryRuleElement193 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElement199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleElement235 = new BitSet(new long[]{0x0000000000006870L});
        public static final BitSet FOLLOW_ruleDataType_in_ruleElement273 = new BitSet(new long[]{0x0000000000006870L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleElement312 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleElement337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType357 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDataType363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDataType399 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleDataType430 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleDataType462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression506 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleExpression617 = new BitSet(new long[]{0x0000000000006072L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleExpression715 = new BitSet(new long[]{0x0000000000006072L});
        public static final BitSet FOLLOW_13_in_ruleExpression817 = new BitSet(new long[]{0x0000000000002050L});
        public static final BitSet FOLLOW_ruleSimpleTerm_in_ruleExpression856 = new BitSet(new long[]{0x0000000000006072L});
        public static final BitSet FOLLOW_14_in_ruleExpression893 = new BitSet(new long[]{0x0000000000006072L});
        public static final BitSet FOLLOW_14_in_ruleExpression984 = new BitSet(new long[]{0x0000000000004022L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleExpression1082 = new BitSet(new long[]{0x0000000000004022L});
        public static final BitSet FOLLOW_ruleSimpleTerm_in_entryRuleSimpleTerm1177 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSimpleTerm1183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleSimpleTerm1227 = new BitSet(new long[]{0x0000000000018052L});
        public static final BitSet FOLLOW_15_in_ruleSimpleTerm1264 = new BitSet(new long[]{0x0000000000010052L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleSimpleTerm1303 = new BitSet(new long[]{0x0000000000010012L});
        public static final BitSet FOLLOW_16_in_ruleSimpleTerm1341 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleTerm1380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleTerm1434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataType_in_synpred2_PsiInternalSimpleBacktrackingBug325745TestLanguage273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_synpred4_PsiInternalSimpleBacktrackingBug325745TestLanguage617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_synpred5_PsiInternalSimpleBacktrackingBug325745TestLanguage715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_synpred7_PsiInternalSimpleBacktrackingBug325745TestLanguage893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_synpred9_PsiInternalSimpleBacktrackingBug325745TestLanguage984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_synpred10_PsiInternalSimpleBacktrackingBug325745TestLanguage1082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_synpred12_PsiInternalSimpleBacktrackingBug325745TestLanguage1303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_synpred14_PsiInternalSimpleBacktrackingBug325745TestLanguage1380 = new BitSet(new long[]{0x0000000000000002L});
    }


}