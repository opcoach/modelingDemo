package com.city.network.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.city.network.xtext.services.CityDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCityDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'BUS'", "'METRO'", "'TRAIN'", "'TRAMWAY'", "'LINEAR'", "'CIRCULAR'", "'City'", "'{'", "'}'", "'location'", "'('", "')'", "'longitude'", "'latitude'", "'altitude'", "'country'", "'-'", "'.'", "'Station'", "'type'", "','", "'nbOfTicketMachines'", "'nbOfElevators'", "'zone'", "'Line'", "'of'", "'topology'", "'stations'", "'hasOffice'", "'isOpened'", "'hasDisabledAccess'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalCityDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCityDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCityDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCityDsl.g"; }


    	private CityDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(CityDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleCity"
    // InternalCityDsl.g:53:1: entryRuleCity : ruleCity EOF ;
    public final void entryRuleCity() throws RecognitionException {
        try {
            // InternalCityDsl.g:54:1: ( ruleCity EOF )
            // InternalCityDsl.g:55:1: ruleCity EOF
            {
             before(grammarAccess.getCityRule()); 
            pushFollow(FOLLOW_1);
            ruleCity();

            state._fsp--;

             after(grammarAccess.getCityRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCity"


    // $ANTLR start "ruleCity"
    // InternalCityDsl.g:62:1: ruleCity : ( ( rule__City__Group__0 ) ) ;
    public final void ruleCity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:66:2: ( ( ( rule__City__Group__0 ) ) )
            // InternalCityDsl.g:67:2: ( ( rule__City__Group__0 ) )
            {
            // InternalCityDsl.g:67:2: ( ( rule__City__Group__0 ) )
            // InternalCityDsl.g:68:3: ( rule__City__Group__0 )
            {
             before(grammarAccess.getCityAccess().getGroup()); 
            // InternalCityDsl.g:69:3: ( rule__City__Group__0 )
            // InternalCityDsl.g:69:4: rule__City__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__City__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCity"


    // $ANTLR start "entryRuleEDouble"
    // InternalCityDsl.g:78:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalCityDsl.g:79:1: ( ruleEDouble EOF )
            // InternalCityDsl.g:80:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalCityDsl.g:87:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:91:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalCityDsl.g:92:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalCityDsl.g:92:2: ( ( rule__EDouble__Group__0 ) )
            // InternalCityDsl.g:93:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalCityDsl.g:94:3: ( rule__EDouble__Group__0 )
            // InternalCityDsl.g:94:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEFloat"
    // InternalCityDsl.g:103:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalCityDsl.g:104:1: ( ruleEFloat EOF )
            // InternalCityDsl.g:105:1: ruleEFloat EOF
            {
             before(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEFloatRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalCityDsl.g:112:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:116:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalCityDsl.g:117:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalCityDsl.g:117:2: ( ( rule__EFloat__Group__0 ) )
            // InternalCityDsl.g:118:3: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // InternalCityDsl.g:119:3: ( rule__EFloat__Group__0 )
            // InternalCityDsl.g:119:4: rule__EFloat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleEString"
    // InternalCityDsl.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalCityDsl.g:129:1: ( ruleEString EOF )
            // InternalCityDsl.g:130:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalCityDsl.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalCityDsl.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalCityDsl.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalCityDsl.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalCityDsl.g:144:3: ( rule__EString__Alternatives )
            // InternalCityDsl.g:144:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleStation"
    // InternalCityDsl.g:153:1: entryRuleStation : ruleStation EOF ;
    public final void entryRuleStation() throws RecognitionException {
        try {
            // InternalCityDsl.g:154:1: ( ruleStation EOF )
            // InternalCityDsl.g:155:1: ruleStation EOF
            {
             before(grammarAccess.getStationRule()); 
            pushFollow(FOLLOW_1);
            ruleStation();

            state._fsp--;

             after(grammarAccess.getStationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStation"


    // $ANTLR start "ruleStation"
    // InternalCityDsl.g:162:1: ruleStation : ( ( rule__Station__Group__0 ) ) ;
    public final void ruleStation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:166:2: ( ( ( rule__Station__Group__0 ) ) )
            // InternalCityDsl.g:167:2: ( ( rule__Station__Group__0 ) )
            {
            // InternalCityDsl.g:167:2: ( ( rule__Station__Group__0 ) )
            // InternalCityDsl.g:168:3: ( rule__Station__Group__0 )
            {
             before(grammarAccess.getStationAccess().getGroup()); 
            // InternalCityDsl.g:169:3: ( rule__Station__Group__0 )
            // InternalCityDsl.g:169:4: rule__Station__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Station__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStation"


    // $ANTLR start "entryRuleLine"
    // InternalCityDsl.g:178:1: entryRuleLine : ruleLine EOF ;
    public final void entryRuleLine() throws RecognitionException {
        try {
            // InternalCityDsl.g:179:1: ( ruleLine EOF )
            // InternalCityDsl.g:180:1: ruleLine EOF
            {
             before(grammarAccess.getLineRule()); 
            pushFollow(FOLLOW_1);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getLineRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLine"


    // $ANTLR start "ruleLine"
    // InternalCityDsl.g:187:1: ruleLine : ( ( rule__Line__Group__0 ) ) ;
    public final void ruleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:191:2: ( ( ( rule__Line__Group__0 ) ) )
            // InternalCityDsl.g:192:2: ( ( rule__Line__Group__0 ) )
            {
            // InternalCityDsl.g:192:2: ( ( rule__Line__Group__0 ) )
            // InternalCityDsl.g:193:3: ( rule__Line__Group__0 )
            {
             before(grammarAccess.getLineAccess().getGroup()); 
            // InternalCityDsl.g:194:3: ( rule__Line__Group__0 )
            // InternalCityDsl.g:194:4: rule__Line__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Line__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLine"


    // $ANTLR start "entryRuleEInt"
    // InternalCityDsl.g:203:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalCityDsl.g:204:1: ( ruleEInt EOF )
            // InternalCityDsl.g:205:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalCityDsl.g:212:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:216:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalCityDsl.g:217:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalCityDsl.g:217:2: ( ( rule__EInt__Group__0 ) )
            // InternalCityDsl.g:218:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalCityDsl.g:219:3: ( rule__EInt__Group__0 )
            // InternalCityDsl.g:219:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleTransportType"
    // InternalCityDsl.g:228:1: ruleTransportType : ( ( rule__TransportType__Alternatives ) ) ;
    public final void ruleTransportType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:232:1: ( ( ( rule__TransportType__Alternatives ) ) )
            // InternalCityDsl.g:233:2: ( ( rule__TransportType__Alternatives ) )
            {
            // InternalCityDsl.g:233:2: ( ( rule__TransportType__Alternatives ) )
            // InternalCityDsl.g:234:3: ( rule__TransportType__Alternatives )
            {
             before(grammarAccess.getTransportTypeAccess().getAlternatives()); 
            // InternalCityDsl.g:235:3: ( rule__TransportType__Alternatives )
            // InternalCityDsl.g:235:4: rule__TransportType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TransportType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTransportTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransportType"


    // $ANTLR start "ruleTopology"
    // InternalCityDsl.g:244:1: ruleTopology : ( ( rule__Topology__Alternatives ) ) ;
    public final void ruleTopology() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:248:1: ( ( ( rule__Topology__Alternatives ) ) )
            // InternalCityDsl.g:249:2: ( ( rule__Topology__Alternatives ) )
            {
            // InternalCityDsl.g:249:2: ( ( rule__Topology__Alternatives ) )
            // InternalCityDsl.g:250:3: ( rule__Topology__Alternatives )
            {
             before(grammarAccess.getTopologyAccess().getAlternatives()); 
            // InternalCityDsl.g:251:3: ( rule__Topology__Alternatives )
            // InternalCityDsl.g:251:4: rule__Topology__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Topology__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTopologyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTopology"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalCityDsl.g:259:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:263:1: ( ( 'E' ) | ( 'e' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCityDsl.g:264:2: ( 'E' )
                    {
                    // InternalCityDsl.g:264:2: ( 'E' )
                    // InternalCityDsl.g:265:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCityDsl.g:270:2: ( 'e' )
                    {
                    // InternalCityDsl.g:270:2: ( 'e' )
                    // InternalCityDsl.g:271:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__EFloat__Alternatives_4_0"
    // InternalCityDsl.g:280:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:284:1: ( ( 'E' ) | ( 'e' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCityDsl.g:285:2: ( 'E' )
                    {
                    // InternalCityDsl.g:285:2: ( 'E' )
                    // InternalCityDsl.g:286:3: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCityDsl.g:291:2: ( 'e' )
                    {
                    // InternalCityDsl.g:291:2: ( 'e' )
                    // InternalCityDsl.g:292:3: 'e'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Alternatives_4_0"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalCityDsl.g:301:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:305:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCityDsl.g:306:2: ( RULE_STRING )
                    {
                    // InternalCityDsl.g:306:2: ( RULE_STRING )
                    // InternalCityDsl.g:307:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCityDsl.g:312:2: ( RULE_ID )
                    {
                    // InternalCityDsl.g:312:2: ( RULE_ID )
                    // InternalCityDsl.g:313:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__TransportType__Alternatives"
    // InternalCityDsl.g:322:1: rule__TransportType__Alternatives : ( ( ( 'BUS' ) ) | ( ( 'METRO' ) ) | ( ( 'TRAIN' ) ) | ( ( 'TRAMWAY' ) ) );
    public final void rule__TransportType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:326:1: ( ( ( 'BUS' ) ) | ( ( 'METRO' ) ) | ( ( 'TRAIN' ) ) | ( ( 'TRAMWAY' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalCityDsl.g:327:2: ( ( 'BUS' ) )
                    {
                    // InternalCityDsl.g:327:2: ( ( 'BUS' ) )
                    // InternalCityDsl.g:328:3: ( 'BUS' )
                    {
                     before(grammarAccess.getTransportTypeAccess().getBUSEnumLiteralDeclaration_0()); 
                    // InternalCityDsl.g:329:3: ( 'BUS' )
                    // InternalCityDsl.g:329:4: 'BUS'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTransportTypeAccess().getBUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCityDsl.g:333:2: ( ( 'METRO' ) )
                    {
                    // InternalCityDsl.g:333:2: ( ( 'METRO' ) )
                    // InternalCityDsl.g:334:3: ( 'METRO' )
                    {
                     before(grammarAccess.getTransportTypeAccess().getMETROEnumLiteralDeclaration_1()); 
                    // InternalCityDsl.g:335:3: ( 'METRO' )
                    // InternalCityDsl.g:335:4: 'METRO'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTransportTypeAccess().getMETROEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCityDsl.g:339:2: ( ( 'TRAIN' ) )
                    {
                    // InternalCityDsl.g:339:2: ( ( 'TRAIN' ) )
                    // InternalCityDsl.g:340:3: ( 'TRAIN' )
                    {
                     before(grammarAccess.getTransportTypeAccess().getTRAINEnumLiteralDeclaration_2()); 
                    // InternalCityDsl.g:341:3: ( 'TRAIN' )
                    // InternalCityDsl.g:341:4: 'TRAIN'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTransportTypeAccess().getTRAINEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCityDsl.g:345:2: ( ( 'TRAMWAY' ) )
                    {
                    // InternalCityDsl.g:345:2: ( ( 'TRAMWAY' ) )
                    // InternalCityDsl.g:346:3: ( 'TRAMWAY' )
                    {
                     before(grammarAccess.getTransportTypeAccess().getTRAMWAYEnumLiteralDeclaration_3()); 
                    // InternalCityDsl.g:347:3: ( 'TRAMWAY' )
                    // InternalCityDsl.g:347:4: 'TRAMWAY'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTransportTypeAccess().getTRAMWAYEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportType__Alternatives"


    // $ANTLR start "rule__Topology__Alternatives"
    // InternalCityDsl.g:355:1: rule__Topology__Alternatives : ( ( ( 'LINEAR' ) ) | ( ( 'CIRCULAR' ) ) );
    public final void rule__Topology__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:359:1: ( ( ( 'LINEAR' ) ) | ( ( 'CIRCULAR' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCityDsl.g:360:2: ( ( 'LINEAR' ) )
                    {
                    // InternalCityDsl.g:360:2: ( ( 'LINEAR' ) )
                    // InternalCityDsl.g:361:3: ( 'LINEAR' )
                    {
                     before(grammarAccess.getTopologyAccess().getLINEAREnumLiteralDeclaration_0()); 
                    // InternalCityDsl.g:362:3: ( 'LINEAR' )
                    // InternalCityDsl.g:362:4: 'LINEAR'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTopologyAccess().getLINEAREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCityDsl.g:366:2: ( ( 'CIRCULAR' ) )
                    {
                    // InternalCityDsl.g:366:2: ( ( 'CIRCULAR' ) )
                    // InternalCityDsl.g:367:3: ( 'CIRCULAR' )
                    {
                     before(grammarAccess.getTopologyAccess().getCIRCULAREnumLiteralDeclaration_1()); 
                    // InternalCityDsl.g:368:3: ( 'CIRCULAR' )
                    // InternalCityDsl.g:368:4: 'CIRCULAR'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTopologyAccess().getCIRCULAREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Topology__Alternatives"


    // $ANTLR start "rule__City__Group__0"
    // InternalCityDsl.g:376:1: rule__City__Group__0 : rule__City__Group__0__Impl rule__City__Group__1 ;
    public final void rule__City__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:380:1: ( rule__City__Group__0__Impl rule__City__Group__1 )
            // InternalCityDsl.g:381:2: rule__City__Group__0__Impl rule__City__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__City__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__City__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__0"


    // $ANTLR start "rule__City__Group__0__Impl"
    // InternalCityDsl.g:388:1: rule__City__Group__0__Impl : ( () ) ;
    public final void rule__City__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:392:1: ( ( () ) )
            // InternalCityDsl.g:393:1: ( () )
            {
            // InternalCityDsl.g:393:1: ( () )
            // InternalCityDsl.g:394:2: ()
            {
             before(grammarAccess.getCityAccess().getCityAction_0()); 
            // InternalCityDsl.g:395:2: ()
            // InternalCityDsl.g:395:3: 
            {
            }

             after(grammarAccess.getCityAccess().getCityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__0__Impl"


    // $ANTLR start "rule__City__Group__1"
    // InternalCityDsl.g:403:1: rule__City__Group__1 : rule__City__Group__1__Impl rule__City__Group__2 ;
    public final void rule__City__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:407:1: ( rule__City__Group__1__Impl rule__City__Group__2 )
            // InternalCityDsl.g:408:2: rule__City__Group__1__Impl rule__City__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__City__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__City__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__1"


    // $ANTLR start "rule__City__Group__1__Impl"
    // InternalCityDsl.g:415:1: rule__City__Group__1__Impl : ( 'City' ) ;
    public final void rule__City__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:419:1: ( ( 'City' ) )
            // InternalCityDsl.g:420:1: ( 'City' )
            {
            // InternalCityDsl.g:420:1: ( 'City' )
            // InternalCityDsl.g:421:2: 'City'
            {
             before(grammarAccess.getCityAccess().getCityKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCityAccess().getCityKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__1__Impl"


    // $ANTLR start "rule__City__Group__2"
    // InternalCityDsl.g:430:1: rule__City__Group__2 : rule__City__Group__2__Impl rule__City__Group__3 ;
    public final void rule__City__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:434:1: ( rule__City__Group__2__Impl rule__City__Group__3 )
            // InternalCityDsl.g:435:2: rule__City__Group__2__Impl rule__City__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__City__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__City__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__2"


    // $ANTLR start "rule__City__Group__2__Impl"
    // InternalCityDsl.g:442:1: rule__City__Group__2__Impl : ( ( rule__City__NameAssignment_2 ) ) ;
    public final void rule__City__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:446:1: ( ( ( rule__City__NameAssignment_2 ) ) )
            // InternalCityDsl.g:447:1: ( ( rule__City__NameAssignment_2 ) )
            {
            // InternalCityDsl.g:447:1: ( ( rule__City__NameAssignment_2 ) )
            // InternalCityDsl.g:448:2: ( rule__City__NameAssignment_2 )
            {
             before(grammarAccess.getCityAccess().getNameAssignment_2()); 
            // InternalCityDsl.g:449:2: ( rule__City__NameAssignment_2 )
            // InternalCityDsl.g:449:3: rule__City__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__City__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCityAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__2__Impl"


    // $ANTLR start "rule__City__Group__3"
    // InternalCityDsl.g:457:1: rule__City__Group__3 : rule__City__Group__3__Impl rule__City__Group__4 ;
    public final void rule__City__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:461:1: ( rule__City__Group__3__Impl rule__City__Group__4 )
            // InternalCityDsl.g:462:2: rule__City__Group__3__Impl rule__City__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__City__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__City__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__3"


    // $ANTLR start "rule__City__Group__3__Impl"
    // InternalCityDsl.g:469:1: rule__City__Group__3__Impl : ( '{' ) ;
    public final void rule__City__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:473:1: ( ( '{' ) )
            // InternalCityDsl.g:474:1: ( '{' )
            {
            // InternalCityDsl.g:474:1: ( '{' )
            // InternalCityDsl.g:475:2: '{'
            {
             before(grammarAccess.getCityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCityAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__3__Impl"


    // $ANTLR start "rule__City__Group__4"
    // InternalCityDsl.g:484:1: rule__City__Group__4 : rule__City__Group__4__Impl rule__City__Group__5 ;
    public final void rule__City__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:488:1: ( rule__City__Group__4__Impl rule__City__Group__5 )
            // InternalCityDsl.g:489:2: rule__City__Group__4__Impl rule__City__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__City__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__City__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__4"


    // $ANTLR start "rule__City__Group__4__Impl"
    // InternalCityDsl.g:496:1: rule__City__Group__4__Impl : ( ( rule__City__Group_4__0 )? ) ;
    public final void rule__City__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:500:1: ( ( ( rule__City__Group_4__0 )? ) )
            // InternalCityDsl.g:501:1: ( ( rule__City__Group_4__0 )? )
            {
            // InternalCityDsl.g:501:1: ( ( rule__City__Group_4__0 )? )
            // InternalCityDsl.g:502:2: ( rule__City__Group_4__0 )?
            {
             before(grammarAccess.getCityAccess().getGroup_4()); 
            // InternalCityDsl.g:503:2: ( rule__City__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCityDsl.g:503:3: rule__City__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__City__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCityAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__4__Impl"


    // $ANTLR start "rule__City__Group__5"
    // InternalCityDsl.g:511:1: rule__City__Group__5 : rule__City__Group__5__Impl rule__City__Group__6 ;
    public final void rule__City__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:515:1: ( rule__City__Group__5__Impl rule__City__Group__6 )
            // InternalCityDsl.g:516:2: rule__City__Group__5__Impl rule__City__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__City__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__City__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__5"


    // $ANTLR start "rule__City__Group__5__Impl"
    // InternalCityDsl.g:523:1: rule__City__Group__5__Impl : ( ( rule__City__Group_5__0 )? ) ;
    public final void rule__City__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:527:1: ( ( ( rule__City__Group_5__0 )? ) )
            // InternalCityDsl.g:528:1: ( ( rule__City__Group_5__0 )? )
            {
            // InternalCityDsl.g:528:1: ( ( rule__City__Group_5__0 )? )
            // InternalCityDsl.g:529:2: ( rule__City__Group_5__0 )?
            {
             before(grammarAccess.getCityAccess().getGroup_5()); 
            // InternalCityDsl.g:530:2: ( rule__City__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCityDsl.g:530:3: rule__City__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__City__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCityAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__5__Impl"


    // $ANTLR start "rule__City__Group__6"
    // InternalCityDsl.g:538:1: rule__City__Group__6 : rule__City__Group__6__Impl rule__City__Group__7 ;
    public final void rule__City__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:542:1: ( rule__City__Group__6__Impl rule__City__Group__7 )
            // InternalCityDsl.g:543:2: rule__City__Group__6__Impl rule__City__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__City__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__City__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__6"


    // $ANTLR start "rule__City__Group__6__Impl"
    // InternalCityDsl.g:550:1: rule__City__Group__6__Impl : ( ( rule__City__Group_6__0 )? ) ;
    public final void rule__City__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:554:1: ( ( ( rule__City__Group_6__0 )? ) )
            // InternalCityDsl.g:555:1: ( ( rule__City__Group_6__0 )? )
            {
            // InternalCityDsl.g:555:1: ( ( rule__City__Group_6__0 )? )
            // InternalCityDsl.g:556:2: ( rule__City__Group_6__0 )?
            {
             before(grammarAccess.getCityAccess().getGroup_6()); 
            // InternalCityDsl.g:557:2: ( rule__City__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCityDsl.g:557:3: rule__City__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__City__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCityAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__6__Impl"


    // $ANTLR start "rule__City__Group__7"
    // InternalCityDsl.g:565:1: rule__City__Group__7 : rule__City__Group__7__Impl rule__City__Group__8 ;
    public final void rule__City__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:569:1: ( rule__City__Group__7__Impl rule__City__Group__8 )
            // InternalCityDsl.g:570:2: rule__City__Group__7__Impl rule__City__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__City__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__City__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__7"


    // $ANTLR start "rule__City__Group__7__Impl"
    // InternalCityDsl.g:577:1: rule__City__Group__7__Impl : ( ( rule__City__Group_7__0 )? ) ;
    public final void rule__City__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:581:1: ( ( ( rule__City__Group_7__0 )? ) )
            // InternalCityDsl.g:582:1: ( ( rule__City__Group_7__0 )? )
            {
            // InternalCityDsl.g:582:1: ( ( rule__City__Group_7__0 )? )
            // InternalCityDsl.g:583:2: ( rule__City__Group_7__0 )?
            {
             before(grammarAccess.getCityAccess().getGroup_7()); 
            // InternalCityDsl.g:584:2: ( rule__City__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==37) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCityDsl.g:584:3: rule__City__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__City__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCityAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__7__Impl"


    // $ANTLR start "rule__City__Group__8"
    // InternalCityDsl.g:592:1: rule__City__Group__8 : rule__City__Group__8__Impl ;
    public final void rule__City__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:596:1: ( rule__City__Group__8__Impl )
            // InternalCityDsl.g:597:2: rule__City__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__City__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__8"


    // $ANTLR start "rule__City__Group__8__Impl"
    // InternalCityDsl.g:603:1: rule__City__Group__8__Impl : ( '}' ) ;
    public final void rule__City__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:607:1: ( ( '}' ) )
            // InternalCityDsl.g:608:1: ( '}' )
            {
            // InternalCityDsl.g:608:1: ( '}' )
            // InternalCityDsl.g:609:2: '}'
            {
             before(grammarAccess.getCityAccess().getRightCurlyBracketKeyword_8()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCityAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group__8__Impl"


    // $ANTLR start "rule__City__Group_4__0"
    // InternalCityDsl.g:619:1: rule__City__Group_4__0 : rule__City__Group_4__0__Impl rule__City__Group_4__1 ;
    public final void rule__City__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:623:1: ( rule__City__Group_4__0__Impl rule__City__Group_4__1 )
            // InternalCityDsl.g:624:2: rule__City__Group_4__0__Impl rule__City__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__City__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__City__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_4__0"


    // $ANTLR start "rule__City__Group_4__0__Impl"
    // InternalCityDsl.g:631:1: rule__City__Group_4__0__Impl : ( 'location' ) ;
    public final void rule__City__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:635:1: ( ( 'location' ) )
            // InternalCityDsl.g:636:1: ( 'location' )
            {
            // InternalCityDsl.g:636:1: ( 'location' )
            // InternalCityDsl.g:637:2: 'location'
            {
             before(grammarAccess.getCityAccess().getLocationKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCityAccess().getLocationKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_4__0__Impl"


    // $ANTLR start "rule__City__Group_4__1"
    // InternalCityDsl.g:646:1: rule__City__Group_4__1 : rule__City__Group_4__1__Impl rule__City__Group_4__2 ;
    public final void rule__City__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:650:1: ( rule__City__Group_4__1__Impl rule__City__Group_4__2 )
            // InternalCityDsl.g:651:2: rule__City__Group_4__1__Impl rule__City__Group_4__2
            {
            pushFollow(FOLLOW_8);
            rule__City__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__City__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_4__1"


    // $ANTLR start "rule__City__Group_4__1__Impl"
    // InternalCityDsl.g:658:1: rule__City__Group_4__1__Impl : ( '(' ) ;
    public final void rule__City__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:662:1: ( ( '(' ) )
            // InternalCityDsl.g:663:1: ( '(' )
            {
            // InternalCityDsl.g:663:1: ( '(' )
            // InternalCityDsl.g:664:2: '('
            {
             before(grammarAccess.getCityAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCityAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_4__1__Impl"


    // $ANTLR start "rule__City__Group_4__2"
    // InternalCityDsl.g:673:1: rule__City__Group_4__2 : rule__City__Group_4__2__Impl rule__City__Group_4__3 ;
    public final void rule__City__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:677:1: ( rule__City__Group_4__2__Impl rule__City__Group_4__3 )
            // InternalCityDsl.g:678:2: rule__City__Group_4__2__Impl rule__City__Group_4__3
            {
            pushFollow(FOLLOW_9);
            rule__City__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__City__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_4__2"


    // $ANTLR start "rule__City__Group_4__2__Impl"
    // InternalCityDsl.g:685:1: rule__City__Group_4__2__Impl : ( ( rule__City__Group_4_2__0 ) ) ;
    public final void rule__City__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:689:1: ( ( ( rule__City__Group_4_2__0 ) ) )
            // InternalCityDsl.g:690:1: ( ( rule__City__Group_4_2__0 ) )
            {
            // InternalCityDsl.g:690:1: ( ( rule__City__Group_4_2__0 ) )
            // InternalCityDsl.g:691:2: ( rule__City__Group_4_2__0 )
            {
             before(grammarAccess.getCityAccess().getGroup_4_2()); 
            // InternalCityDsl.g:692:2: ( rule__City__Group_4_2__0 )
            // InternalCityDsl.g:692:3: rule__City__Group_4_2__0
            {
            pushFollow(FOLLOW_2);
            rule__City__Group_4_2__0();

            state._fsp--;


            }

             after(grammarAccess.getCityAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_4__2__Impl"


    // $ANTLR start "rule__City__Group_4__3"
    // InternalCityDsl.g:700:1: rule__City__Group_4__3 : rule__City__Group_4__3__Impl rule__City__Group_4__4 ;
    public final void rule__City__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:704:1: ( rule__City__Group_4__3__Impl rule__City__Group_4__4 )
            // InternalCityDsl.g:705:2: rule__City__Group_4__3__Impl rule__City__Group_4__4
            {
            pushFollow(FOLLOW_10);
            rule__City__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__City__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_4__3"


    // $ANTLR start "rule__City__Group_4__3__Impl"
    // InternalCityDsl.g:712:1: rule__City__Group_4__3__Impl : ( ( rule__City__Group_4_3__0 ) ) ;
    public final void rule__City__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:716:1: ( ( ( rule__City__Group_4_3__0 ) ) )
            // InternalCityDsl.g:717:1: ( ( rule__City__Group_4_3__0 ) )
            {
            // InternalCityDsl.g:717:1: ( ( rule__City__Group_4_3__0 ) )
            // InternalCityDsl.g:718:2: ( rule__City__Group_4_3__0 )
            {
             before(grammarAccess.getCityAccess().getGroup_4_3()); 
            // InternalCityDsl.g:719:2: ( rule__City__Group_4_3__0 )
            // InternalCityDsl.g:719:3: rule__City__Group_4_3__0
            {
            pushFollow(FOLLOW_2);
            rule__City__Group_4_3__0();

            state._fsp--;


            }

             after(grammarAccess.getCityAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_4__3__Impl"


    // $ANTLR start "rule__City__Group_4__4"
    // InternalCityDsl.g:727:1: rule__City__Group_4__4 : rule__City__Group_4__4__Impl rule__City__Group_4__5 ;
    public final void rule__City__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:731:1: ( rule__City__Group_4__4__Impl rule__City__Group_4__5 )
            // InternalCityDsl.g:732:2: rule__City__Group_4__4__Impl rule__City__Group_4__5
            {
            pushFollow(FOLLOW_11);
            rule__City__Group_4__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__City__Group_4__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_4__4"


    // $ANTLR start "rule__City__Group_4__4__Impl"
    // InternalCityDsl.g:739:1: rule__City__Group_4__4__Impl : ( ( rule__City__Group_4_4__0 ) ) ;
    public final void rule__City__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:743:1: ( ( ( rule__City__Group_4_4__0 ) ) )
            // InternalCityDsl.g:744:1: ( ( rule__City__Group_4_4__0 ) )
            {
            // InternalCityDsl.g:744:1: ( ( rule__City__Group_4_4__0 ) )
            // InternalCityDsl.g:745:2: ( rule__City__Group_4_4__0 )
            {
             before(grammarAccess.getCityAccess().getGroup_4_4()); 
            // InternalCityDsl.g:746:2: ( rule__City__Group_4_4__0 )
            // InternalCityDsl.g:746:3: rule__City__Group_4_4__0
            {
            pushFollow(FOLLOW_2);
            rule__City__Group_4_4__0();

            state._fsp--;


            }

             after(grammarAccess.getCityAccess().getGroup_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_4__4__Impl"


    // $ANTLR start "rule__City__Group_4__5"
    // InternalCityDsl.g:754:1: rule__City__Group_4__5 : rule__City__Group_4__5__Impl ;
    public final void rule__City__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:758:1: ( rule__City__Group_4__5__Impl )
            // InternalCityDsl.g:759:2: rule__City__Group_4__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__City__Group_4__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_4__5"


    // $ANTLR start "rule__City__Group_4__5__Impl"
    // InternalCityDsl.g:765:1: rule__City__Group_4__5__Impl : ( ')' ) ;
    public final void rule__City__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:769:1: ( ( ')' ) )
            // InternalCityDsl.g:770:1: ( ')' )
            {
            // InternalCityDsl.g:770:1: ( ')' )
            // InternalCityDsl.g:771:2: ')'
            {
             before(grammarAccess.getCityAccess().getRightParenthesisKeyword_4_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCityAccess().getRightParenthesisKeyword_4_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_4__5__Impl"


    // $ANTLR start "rule__City__Group_4_2__0"
    // InternalCityDsl.g:781:1: rule__City__Group_4_2__0 : rule__City__Group_4_2__0__Impl rule__City__Group_4_2__1 ;
    public final void rule__City__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:785:1: ( rule__City__Group_4_2__0__Impl rule__City__Group_4_2__1 )
            // InternalCityDsl.g:786:2: rule__City__Group_4_2__0__Impl rule__City__Group_4_2__1
            {
            pushFollow(FOLLOW_12);
            rule__City__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__City__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_4_2__0"


    // $ANTLR start "rule__City__Group_4_2__0__Impl"
    // InternalCityDsl.g:793:1: rule__City__Group_4_2__0__Impl : ( 'longitude' ) ;
    public final void rule__City__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:797:1: ( ( 'longitude' ) )
            // InternalCityDsl.g:798:1: ( 'longitude' )
            {
            // InternalCityDsl.g:798:1: ( 'longitude' )
            // InternalCityDsl.g:799:2: 'longitude'
            {
             before(grammarAccess.getCityAccess().getLongitudeKeyword_4_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCityAccess().getLongitudeKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_4_2__0__Impl"


    // $ANTLR start "rule__City__Group_4_2__1"
    // InternalCityDsl.g:808:1: rule__City__Group_4_2__1 : rule__City__Group_4_2__1__Impl ;
    public final void rule__City__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:812:1: ( rule__City__Group_4_2__1__Impl )
            // InternalCityDsl.g:813:2: rule__City__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__City__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_4_2__1"


    // $ANTLR start "rule__City__Group_4_2__1__Impl"
    // InternalCityDsl.g:819:1: rule__City__Group_4_2__1__Impl : ( ( rule__City__LongitudeAssignment_4_2_1 ) ) ;
    public final void rule__City__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:823:1: ( ( ( rule__City__LongitudeAssignment_4_2_1 ) ) )
            // InternalCityDsl.g:824:1: ( ( rule__City__LongitudeAssignment_4_2_1 ) )
            {
            // InternalCityDsl.g:824:1: ( ( rule__City__LongitudeAssignment_4_2_1 ) )
            // InternalCityDsl.g:825:2: ( rule__City__LongitudeAssignment_4_2_1 )
            {
             before(grammarAccess.getCityAccess().getLongitudeAssignment_4_2_1()); 
            // InternalCityDsl.g:826:2: ( rule__City__LongitudeAssignment_4_2_1 )
            // InternalCityDsl.g:826:3: rule__City__LongitudeAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__City__LongitudeAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCityAccess().getLongitudeAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_4_2__1__Impl"


    // $ANTLR start "rule__City__Group_4_3__0"
    // InternalCityDsl.g:835:1: rule__City__Group_4_3__0 : rule__City__Group_4_3__0__Impl rule__City__Group_4_3__1 ;
    public final void rule__City__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:839:1: ( rule__City__Group_4_3__0__Impl rule__City__Group_4_3__1 )
            // InternalCityDsl.g:840:2: rule__City__Group_4_3__0__Impl rule__City__Group_4_3__1
            {
            pushFollow(FOLLOW_12);
            rule__City__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__City__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_4_3__0"


    // $ANTLR start "rule__City__Group_4_3__0__Impl"
    // InternalCityDsl.g:847:1: rule__City__Group_4_3__0__Impl : ( 'latitude' ) ;
    public final void rule__City__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:851:1: ( ( 'latitude' ) )
            // InternalCityDsl.g:852:1: ( 'latitude' )
            {
            // InternalCityDsl.g:852:1: ( 'latitude' )
            // InternalCityDsl.g:853:2: 'latitude'
            {
             before(grammarAccess.getCityAccess().getLatitudeKeyword_4_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCityAccess().getLatitudeKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_4_3__0__Impl"


    // $ANTLR start "rule__City__Group_4_3__1"
    // InternalCityDsl.g:862:1: rule__City__Group_4_3__1 : rule__City__Group_4_3__1__Impl ;
    public final void rule__City__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:866:1: ( rule__City__Group_4_3__1__Impl )
            // InternalCityDsl.g:867:2: rule__City__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__City__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_4_3__1"


    // $ANTLR start "rule__City__Group_4_3__1__Impl"
    // InternalCityDsl.g:873:1: rule__City__Group_4_3__1__Impl : ( ( rule__City__LatitudeAssignment_4_3_1 ) ) ;
    public final void rule__City__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:877:1: ( ( ( rule__City__LatitudeAssignment_4_3_1 ) ) )
            // InternalCityDsl.g:878:1: ( ( rule__City__LatitudeAssignment_4_3_1 ) )
            {
            // InternalCityDsl.g:878:1: ( ( rule__City__LatitudeAssignment_4_3_1 ) )
            // InternalCityDsl.g:879:2: ( rule__City__LatitudeAssignment_4_3_1 )
            {
             before(grammarAccess.getCityAccess().getLatitudeAssignment_4_3_1()); 
            // InternalCityDsl.g:880:2: ( rule__City__LatitudeAssignment_4_3_1 )
            // InternalCityDsl.g:880:3: rule__City__LatitudeAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__City__LatitudeAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCityAccess().getLatitudeAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_4_3__1__Impl"


    // $ANTLR start "rule__City__Group_4_4__0"
    // InternalCityDsl.g:889:1: rule__City__Group_4_4__0 : rule__City__Group_4_4__0__Impl rule__City__Group_4_4__1 ;
    public final void rule__City__Group_4_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:893:1: ( rule__City__Group_4_4__0__Impl rule__City__Group_4_4__1 )
            // InternalCityDsl.g:894:2: rule__City__Group_4_4__0__Impl rule__City__Group_4_4__1
            {
            pushFollow(FOLLOW_12);
            rule__City__Group_4_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__City__Group_4_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_4_4__0"


    // $ANTLR start "rule__City__Group_4_4__0__Impl"
    // InternalCityDsl.g:901:1: rule__City__Group_4_4__0__Impl : ( 'altitude' ) ;
    public final void rule__City__Group_4_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:905:1: ( ( 'altitude' ) )
            // InternalCityDsl.g:906:1: ( 'altitude' )
            {
            // InternalCityDsl.g:906:1: ( 'altitude' )
            // InternalCityDsl.g:907:2: 'altitude'
            {
             before(grammarAccess.getCityAccess().getAltitudeKeyword_4_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCityAccess().getAltitudeKeyword_4_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_4_4__0__Impl"


    // $ANTLR start "rule__City__Group_4_4__1"
    // InternalCityDsl.g:916:1: rule__City__Group_4_4__1 : rule__City__Group_4_4__1__Impl ;
    public final void rule__City__Group_4_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:920:1: ( rule__City__Group_4_4__1__Impl )
            // InternalCityDsl.g:921:2: rule__City__Group_4_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__City__Group_4_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_4_4__1"


    // $ANTLR start "rule__City__Group_4_4__1__Impl"
    // InternalCityDsl.g:927:1: rule__City__Group_4_4__1__Impl : ( ( rule__City__AltitudeAssignment_4_4_1 ) ) ;
    public final void rule__City__Group_4_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:931:1: ( ( ( rule__City__AltitudeAssignment_4_4_1 ) ) )
            // InternalCityDsl.g:932:1: ( ( rule__City__AltitudeAssignment_4_4_1 ) )
            {
            // InternalCityDsl.g:932:1: ( ( rule__City__AltitudeAssignment_4_4_1 ) )
            // InternalCityDsl.g:933:2: ( rule__City__AltitudeAssignment_4_4_1 )
            {
             before(grammarAccess.getCityAccess().getAltitudeAssignment_4_4_1()); 
            // InternalCityDsl.g:934:2: ( rule__City__AltitudeAssignment_4_4_1 )
            // InternalCityDsl.g:934:3: rule__City__AltitudeAssignment_4_4_1
            {
            pushFollow(FOLLOW_2);
            rule__City__AltitudeAssignment_4_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCityAccess().getAltitudeAssignment_4_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_4_4__1__Impl"


    // $ANTLR start "rule__City__Group_5__0"
    // InternalCityDsl.g:943:1: rule__City__Group_5__0 : rule__City__Group_5__0__Impl rule__City__Group_5__1 ;
    public final void rule__City__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:947:1: ( rule__City__Group_5__0__Impl rule__City__Group_5__1 )
            // InternalCityDsl.g:948:2: rule__City__Group_5__0__Impl rule__City__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__City__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__City__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_5__0"


    // $ANTLR start "rule__City__Group_5__0__Impl"
    // InternalCityDsl.g:955:1: rule__City__Group_5__0__Impl : ( 'country' ) ;
    public final void rule__City__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:959:1: ( ( 'country' ) )
            // InternalCityDsl.g:960:1: ( 'country' )
            {
            // InternalCityDsl.g:960:1: ( 'country' )
            // InternalCityDsl.g:961:2: 'country'
            {
             before(grammarAccess.getCityAccess().getCountryKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCityAccess().getCountryKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_5__0__Impl"


    // $ANTLR start "rule__City__Group_5__1"
    // InternalCityDsl.g:970:1: rule__City__Group_5__1 : rule__City__Group_5__1__Impl ;
    public final void rule__City__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:974:1: ( rule__City__Group_5__1__Impl )
            // InternalCityDsl.g:975:2: rule__City__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__City__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_5__1"


    // $ANTLR start "rule__City__Group_5__1__Impl"
    // InternalCityDsl.g:981:1: rule__City__Group_5__1__Impl : ( ( rule__City__CountryAssignment_5_1 ) ) ;
    public final void rule__City__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:985:1: ( ( ( rule__City__CountryAssignment_5_1 ) ) )
            // InternalCityDsl.g:986:1: ( ( rule__City__CountryAssignment_5_1 ) )
            {
            // InternalCityDsl.g:986:1: ( ( rule__City__CountryAssignment_5_1 ) )
            // InternalCityDsl.g:987:2: ( rule__City__CountryAssignment_5_1 )
            {
             before(grammarAccess.getCityAccess().getCountryAssignment_5_1()); 
            // InternalCityDsl.g:988:2: ( rule__City__CountryAssignment_5_1 )
            // InternalCityDsl.g:988:3: rule__City__CountryAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__City__CountryAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCityAccess().getCountryAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_5__1__Impl"


    // $ANTLR start "rule__City__Group_6__0"
    // InternalCityDsl.g:997:1: rule__City__Group_6__0 : rule__City__Group_6__0__Impl rule__City__Group_6__1 ;
    public final void rule__City__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1001:1: ( rule__City__Group_6__0__Impl rule__City__Group_6__1 )
            // InternalCityDsl.g:1002:2: rule__City__Group_6__0__Impl rule__City__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__City__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__City__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_6__0"


    // $ANTLR start "rule__City__Group_6__0__Impl"
    // InternalCityDsl.g:1009:1: rule__City__Group_6__0__Impl : ( ( rule__City__StationsAssignment_6_0 ) ) ;
    public final void rule__City__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1013:1: ( ( ( rule__City__StationsAssignment_6_0 ) ) )
            // InternalCityDsl.g:1014:1: ( ( rule__City__StationsAssignment_6_0 ) )
            {
            // InternalCityDsl.g:1014:1: ( ( rule__City__StationsAssignment_6_0 ) )
            // InternalCityDsl.g:1015:2: ( rule__City__StationsAssignment_6_0 )
            {
             before(grammarAccess.getCityAccess().getStationsAssignment_6_0()); 
            // InternalCityDsl.g:1016:2: ( rule__City__StationsAssignment_6_0 )
            // InternalCityDsl.g:1016:3: rule__City__StationsAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__City__StationsAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getCityAccess().getStationsAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_6__0__Impl"


    // $ANTLR start "rule__City__Group_6__1"
    // InternalCityDsl.g:1024:1: rule__City__Group_6__1 : rule__City__Group_6__1__Impl ;
    public final void rule__City__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1028:1: ( rule__City__Group_6__1__Impl )
            // InternalCityDsl.g:1029:2: rule__City__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__City__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_6__1"


    // $ANTLR start "rule__City__Group_6__1__Impl"
    // InternalCityDsl.g:1035:1: rule__City__Group_6__1__Impl : ( ( rule__City__StationsAssignment_6_1 )* ) ;
    public final void rule__City__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1039:1: ( ( ( rule__City__StationsAssignment_6_1 )* ) )
            // InternalCityDsl.g:1040:1: ( ( rule__City__StationsAssignment_6_1 )* )
            {
            // InternalCityDsl.g:1040:1: ( ( rule__City__StationsAssignment_6_1 )* )
            // InternalCityDsl.g:1041:2: ( rule__City__StationsAssignment_6_1 )*
            {
             before(grammarAccess.getCityAccess().getStationsAssignment_6_1()); 
            // InternalCityDsl.g:1042:2: ( rule__City__StationsAssignment_6_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==31) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCityDsl.g:1042:3: rule__City__StationsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__City__StationsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getCityAccess().getStationsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_6__1__Impl"


    // $ANTLR start "rule__City__Group_7__0"
    // InternalCityDsl.g:1051:1: rule__City__Group_7__0 : rule__City__Group_7__0__Impl rule__City__Group_7__1 ;
    public final void rule__City__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1055:1: ( rule__City__Group_7__0__Impl rule__City__Group_7__1 )
            // InternalCityDsl.g:1056:2: rule__City__Group_7__0__Impl rule__City__Group_7__1
            {
            pushFollow(FOLLOW_15);
            rule__City__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__City__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_7__0"


    // $ANTLR start "rule__City__Group_7__0__Impl"
    // InternalCityDsl.g:1063:1: rule__City__Group_7__0__Impl : ( ( rule__City__LinesAssignment_7_0 ) ) ;
    public final void rule__City__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1067:1: ( ( ( rule__City__LinesAssignment_7_0 ) ) )
            // InternalCityDsl.g:1068:1: ( ( rule__City__LinesAssignment_7_0 ) )
            {
            // InternalCityDsl.g:1068:1: ( ( rule__City__LinesAssignment_7_0 ) )
            // InternalCityDsl.g:1069:2: ( rule__City__LinesAssignment_7_0 )
            {
             before(grammarAccess.getCityAccess().getLinesAssignment_7_0()); 
            // InternalCityDsl.g:1070:2: ( rule__City__LinesAssignment_7_0 )
            // InternalCityDsl.g:1070:3: rule__City__LinesAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__City__LinesAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getCityAccess().getLinesAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_7__0__Impl"


    // $ANTLR start "rule__City__Group_7__1"
    // InternalCityDsl.g:1078:1: rule__City__Group_7__1 : rule__City__Group_7__1__Impl ;
    public final void rule__City__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1082:1: ( rule__City__Group_7__1__Impl )
            // InternalCityDsl.g:1083:2: rule__City__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__City__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_7__1"


    // $ANTLR start "rule__City__Group_7__1__Impl"
    // InternalCityDsl.g:1089:1: rule__City__Group_7__1__Impl : ( ( rule__City__LinesAssignment_7_1 )* ) ;
    public final void rule__City__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1093:1: ( ( ( rule__City__LinesAssignment_7_1 )* ) )
            // InternalCityDsl.g:1094:1: ( ( rule__City__LinesAssignment_7_1 )* )
            {
            // InternalCityDsl.g:1094:1: ( ( rule__City__LinesAssignment_7_1 )* )
            // InternalCityDsl.g:1095:2: ( rule__City__LinesAssignment_7_1 )*
            {
             before(grammarAccess.getCityAccess().getLinesAssignment_7_1()); 
            // InternalCityDsl.g:1096:2: ( rule__City__LinesAssignment_7_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==37) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCityDsl.g:1096:3: rule__City__LinesAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__City__LinesAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getCityAccess().getLinesAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__Group_7__1__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalCityDsl.g:1105:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1109:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalCityDsl.g:1110:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalCityDsl.g:1117:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1121:1: ( ( ( '-' )? ) )
            // InternalCityDsl.g:1122:1: ( ( '-' )? )
            {
            // InternalCityDsl.g:1122:1: ( ( '-' )? )
            // InternalCityDsl.g:1123:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalCityDsl.g:1124:2: ( '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCityDsl.g:1124:3: '-'
                    {
                    match(input,29,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalCityDsl.g:1132:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1136:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalCityDsl.g:1137:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalCityDsl.g:1144:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1148:1: ( ( ( RULE_INT )? ) )
            // InternalCityDsl.g:1149:1: ( ( RULE_INT )? )
            {
            // InternalCityDsl.g:1149:1: ( ( RULE_INT )? )
            // InternalCityDsl.g:1150:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalCityDsl.g:1151:2: ( RULE_INT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCityDsl.g:1151:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalCityDsl.g:1159:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1163:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalCityDsl.g:1164:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalCityDsl.g:1171:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1175:1: ( ( '.' ) )
            // InternalCityDsl.g:1176:1: ( '.' )
            {
            // InternalCityDsl.g:1176:1: ( '.' )
            // InternalCityDsl.g:1177:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalCityDsl.g:1186:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1190:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalCityDsl.g:1191:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalCityDsl.g:1198:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1202:1: ( ( RULE_INT ) )
            // InternalCityDsl.g:1203:1: ( RULE_INT )
            {
            // InternalCityDsl.g:1203:1: ( RULE_INT )
            // InternalCityDsl.g:1204:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalCityDsl.g:1213:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1217:1: ( rule__EDouble__Group__4__Impl )
            // InternalCityDsl.g:1218:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalCityDsl.g:1224:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1228:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalCityDsl.g:1229:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalCityDsl.g:1229:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalCityDsl.g:1230:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalCityDsl.g:1231:2: ( rule__EDouble__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=11 && LA14_0<=12)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCityDsl.g:1231:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalCityDsl.g:1240:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1244:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalCityDsl.g:1245:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_19);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalCityDsl.g:1252:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1256:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalCityDsl.g:1257:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalCityDsl.g:1257:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalCityDsl.g:1258:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalCityDsl.g:1259:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalCityDsl.g:1259:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalCityDsl.g:1267:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1271:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalCityDsl.g:1272:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_19);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalCityDsl.g:1279:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1283:1: ( ( ( '-' )? ) )
            // InternalCityDsl.g:1284:1: ( ( '-' )? )
            {
            // InternalCityDsl.g:1284:1: ( ( '-' )? )
            // InternalCityDsl.g:1285:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalCityDsl.g:1286:2: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCityDsl.g:1286:3: '-'
                    {
                    match(input,29,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalCityDsl.g:1294:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1298:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalCityDsl.g:1299:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalCityDsl.g:1305:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1309:1: ( ( RULE_INT ) )
            // InternalCityDsl.g:1310:1: ( RULE_INT )
            {
            // InternalCityDsl.g:1310:1: ( RULE_INT )
            // InternalCityDsl.g:1311:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__EFloat__Group__0"
    // InternalCityDsl.g:1321:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1325:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalCityDsl.g:1326:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0"


    // $ANTLR start "rule__EFloat__Group__0__Impl"
    // InternalCityDsl.g:1333:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1337:1: ( ( ( '-' )? ) )
            // InternalCityDsl.g:1338:1: ( ( '-' )? )
            {
            // InternalCityDsl.g:1338:1: ( ( '-' )? )
            // InternalCityDsl.g:1339:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalCityDsl.g:1340:2: ( '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCityDsl.g:1340:3: '-'
                    {
                    match(input,29,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0__Impl"


    // $ANTLR start "rule__EFloat__Group__1"
    // InternalCityDsl.g:1348:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1352:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalCityDsl.g:1353:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1"


    // $ANTLR start "rule__EFloat__Group__1__Impl"
    // InternalCityDsl.g:1360:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1364:1: ( ( ( RULE_INT )? ) )
            // InternalCityDsl.g:1365:1: ( ( RULE_INT )? )
            {
            // InternalCityDsl.g:1365:1: ( ( RULE_INT )? )
            // InternalCityDsl.g:1366:2: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // InternalCityDsl.g:1367:2: ( RULE_INT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCityDsl.g:1367:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__2"
    // InternalCityDsl.g:1375:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1379:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // InternalCityDsl.g:1380:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__EFloat__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2"


    // $ANTLR start "rule__EFloat__Group__2__Impl"
    // InternalCityDsl.g:1387:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1391:1: ( ( '.' ) )
            // InternalCityDsl.g:1392:1: ( '.' )
            {
            // InternalCityDsl.g:1392:1: ( '.' )
            // InternalCityDsl.g:1393:2: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2__Impl"


    // $ANTLR start "rule__EFloat__Group__3"
    // InternalCityDsl.g:1402:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1406:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // InternalCityDsl.g:1407:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__EFloat__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__3"


    // $ANTLR start "rule__EFloat__Group__3__Impl"
    // InternalCityDsl.g:1414:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1418:1: ( ( RULE_INT ) )
            // InternalCityDsl.g:1419:1: ( RULE_INT )
            {
            // InternalCityDsl.g:1419:1: ( RULE_INT )
            // InternalCityDsl.g:1420:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__3__Impl"


    // $ANTLR start "rule__EFloat__Group__4"
    // InternalCityDsl.g:1429:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1433:1: ( rule__EFloat__Group__4__Impl )
            // InternalCityDsl.g:1434:2: rule__EFloat__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__4"


    // $ANTLR start "rule__EFloat__Group__4__Impl"
    // InternalCityDsl.g:1440:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1444:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // InternalCityDsl.g:1445:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // InternalCityDsl.g:1445:1: ( ( rule__EFloat__Group_4__0 )? )
            // InternalCityDsl.g:1446:2: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // InternalCityDsl.g:1447:2: ( rule__EFloat__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=11 && LA18_0<=12)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCityDsl.g:1447:3: rule__EFloat__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EFloat__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__4__Impl"


    // $ANTLR start "rule__EFloat__Group_4__0"
    // InternalCityDsl.g:1456:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1460:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // InternalCityDsl.g:1461:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FOLLOW_19);
            rule__EFloat__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__0"


    // $ANTLR start "rule__EFloat__Group_4__0__Impl"
    // InternalCityDsl.g:1468:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1472:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // InternalCityDsl.g:1473:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // InternalCityDsl.g:1473:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // InternalCityDsl.g:1474:2: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // InternalCityDsl.g:1475:2: ( rule__EFloat__Alternatives_4_0 )
            // InternalCityDsl.g:1475:3: rule__EFloat__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__0__Impl"


    // $ANTLR start "rule__EFloat__Group_4__1"
    // InternalCityDsl.g:1483:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1487:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // InternalCityDsl.g:1488:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FOLLOW_19);
            rule__EFloat__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__1"


    // $ANTLR start "rule__EFloat__Group_4__1__Impl"
    // InternalCityDsl.g:1495:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1499:1: ( ( ( '-' )? ) )
            // InternalCityDsl.g:1500:1: ( ( '-' )? )
            {
            // InternalCityDsl.g:1500:1: ( ( '-' )? )
            // InternalCityDsl.g:1501:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // InternalCityDsl.g:1502:2: ( '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCityDsl.g:1502:3: '-'
                    {
                    match(input,29,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__1__Impl"


    // $ANTLR start "rule__EFloat__Group_4__2"
    // InternalCityDsl.g:1510:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1514:1: ( rule__EFloat__Group_4__2__Impl )
            // InternalCityDsl.g:1515:2: rule__EFloat__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__2"


    // $ANTLR start "rule__EFloat__Group_4__2__Impl"
    // InternalCityDsl.g:1521:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1525:1: ( ( RULE_INT ) )
            // InternalCityDsl.g:1526:1: ( RULE_INT )
            {
            // InternalCityDsl.g:1526:1: ( RULE_INT )
            // InternalCityDsl.g:1527:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__2__Impl"


    // $ANTLR start "rule__Station__Group__0"
    // InternalCityDsl.g:1537:1: rule__Station__Group__0 : rule__Station__Group__0__Impl rule__Station__Group__1 ;
    public final void rule__Station__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1541:1: ( rule__Station__Group__0__Impl rule__Station__Group__1 )
            // InternalCityDsl.g:1542:2: rule__Station__Group__0__Impl rule__Station__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Station__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Station__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__0"


    // $ANTLR start "rule__Station__Group__0__Impl"
    // InternalCityDsl.g:1549:1: rule__Station__Group__0__Impl : ( 'Station' ) ;
    public final void rule__Station__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1553:1: ( ( 'Station' ) )
            // InternalCityDsl.g:1554:1: ( 'Station' )
            {
            // InternalCityDsl.g:1554:1: ( 'Station' )
            // InternalCityDsl.g:1555:2: 'Station'
            {
             before(grammarAccess.getStationAccess().getStationKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getStationAccess().getStationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__0__Impl"


    // $ANTLR start "rule__Station__Group__1"
    // InternalCityDsl.g:1564:1: rule__Station__Group__1 : rule__Station__Group__1__Impl rule__Station__Group__2 ;
    public final void rule__Station__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1568:1: ( rule__Station__Group__1__Impl rule__Station__Group__2 )
            // InternalCityDsl.g:1569:2: rule__Station__Group__1__Impl rule__Station__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Station__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Station__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__1"


    // $ANTLR start "rule__Station__Group__1__Impl"
    // InternalCityDsl.g:1576:1: rule__Station__Group__1__Impl : ( ( rule__Station__NameAssignment_1 ) ) ;
    public final void rule__Station__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1580:1: ( ( ( rule__Station__NameAssignment_1 ) ) )
            // InternalCityDsl.g:1581:1: ( ( rule__Station__NameAssignment_1 ) )
            {
            // InternalCityDsl.g:1581:1: ( ( rule__Station__NameAssignment_1 ) )
            // InternalCityDsl.g:1582:2: ( rule__Station__NameAssignment_1 )
            {
             before(grammarAccess.getStationAccess().getNameAssignment_1()); 
            // InternalCityDsl.g:1583:2: ( rule__Station__NameAssignment_1 )
            // InternalCityDsl.g:1583:3: rule__Station__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Station__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__1__Impl"


    // $ANTLR start "rule__Station__Group__2"
    // InternalCityDsl.g:1591:1: rule__Station__Group__2 : rule__Station__Group__2__Impl rule__Station__Group__3 ;
    public final void rule__Station__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1595:1: ( rule__Station__Group__2__Impl rule__Station__Group__3 )
            // InternalCityDsl.g:1596:2: rule__Station__Group__2__Impl rule__Station__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Station__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Station__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__2"


    // $ANTLR start "rule__Station__Group__2__Impl"
    // InternalCityDsl.g:1603:1: rule__Station__Group__2__Impl : ( '{' ) ;
    public final void rule__Station__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1607:1: ( ( '{' ) )
            // InternalCityDsl.g:1608:1: ( '{' )
            {
            // InternalCityDsl.g:1608:1: ( '{' )
            // InternalCityDsl.g:1609:2: '{'
            {
             before(grammarAccess.getStationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__2__Impl"


    // $ANTLR start "rule__Station__Group__3"
    // InternalCityDsl.g:1618:1: rule__Station__Group__3 : rule__Station__Group__3__Impl rule__Station__Group__4 ;
    public final void rule__Station__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1622:1: ( rule__Station__Group__3__Impl rule__Station__Group__4 )
            // InternalCityDsl.g:1623:2: rule__Station__Group__3__Impl rule__Station__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Station__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Station__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__3"


    // $ANTLR start "rule__Station__Group__3__Impl"
    // InternalCityDsl.g:1630:1: rule__Station__Group__3__Impl : ( ( rule__Station__Group_3__0 )? ) ;
    public final void rule__Station__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1634:1: ( ( ( rule__Station__Group_3__0 )? ) )
            // InternalCityDsl.g:1635:1: ( ( rule__Station__Group_3__0 )? )
            {
            // InternalCityDsl.g:1635:1: ( ( rule__Station__Group_3__0 )? )
            // InternalCityDsl.g:1636:2: ( rule__Station__Group_3__0 )?
            {
             before(grammarAccess.getStationAccess().getGroup_3()); 
            // InternalCityDsl.g:1637:2: ( rule__Station__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCityDsl.g:1637:3: rule__Station__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Station__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__3__Impl"


    // $ANTLR start "rule__Station__Group__4"
    // InternalCityDsl.g:1645:1: rule__Station__Group__4 : rule__Station__Group__4__Impl rule__Station__Group__5 ;
    public final void rule__Station__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1649:1: ( rule__Station__Group__4__Impl rule__Station__Group__5 )
            // InternalCityDsl.g:1650:2: rule__Station__Group__4__Impl rule__Station__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Station__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Station__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__4"


    // $ANTLR start "rule__Station__Group__4__Impl"
    // InternalCityDsl.g:1657:1: rule__Station__Group__4__Impl : ( ( rule__Station__OfficeAssignment_4 )? ) ;
    public final void rule__Station__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1661:1: ( ( ( rule__Station__OfficeAssignment_4 )? ) )
            // InternalCityDsl.g:1662:1: ( ( rule__Station__OfficeAssignment_4 )? )
            {
            // InternalCityDsl.g:1662:1: ( ( rule__Station__OfficeAssignment_4 )? )
            // InternalCityDsl.g:1663:2: ( rule__Station__OfficeAssignment_4 )?
            {
             before(grammarAccess.getStationAccess().getOfficeAssignment_4()); 
            // InternalCityDsl.g:1664:2: ( rule__Station__OfficeAssignment_4 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==41) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCityDsl.g:1664:3: rule__Station__OfficeAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Station__OfficeAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStationAccess().getOfficeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__4__Impl"


    // $ANTLR start "rule__Station__Group__5"
    // InternalCityDsl.g:1672:1: rule__Station__Group__5 : rule__Station__Group__5__Impl rule__Station__Group__6 ;
    public final void rule__Station__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1676:1: ( rule__Station__Group__5__Impl rule__Station__Group__6 )
            // InternalCityDsl.g:1677:2: rule__Station__Group__5__Impl rule__Station__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Station__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Station__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__5"


    // $ANTLR start "rule__Station__Group__5__Impl"
    // InternalCityDsl.g:1684:1: rule__Station__Group__5__Impl : ( ( rule__Station__OpenedAssignment_5 )? ) ;
    public final void rule__Station__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1688:1: ( ( ( rule__Station__OpenedAssignment_5 )? ) )
            // InternalCityDsl.g:1689:1: ( ( rule__Station__OpenedAssignment_5 )? )
            {
            // InternalCityDsl.g:1689:1: ( ( rule__Station__OpenedAssignment_5 )? )
            // InternalCityDsl.g:1690:2: ( rule__Station__OpenedAssignment_5 )?
            {
             before(grammarAccess.getStationAccess().getOpenedAssignment_5()); 
            // InternalCityDsl.g:1691:2: ( rule__Station__OpenedAssignment_5 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==42) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCityDsl.g:1691:3: rule__Station__OpenedAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Station__OpenedAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStationAccess().getOpenedAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__5__Impl"


    // $ANTLR start "rule__Station__Group__6"
    // InternalCityDsl.g:1699:1: rule__Station__Group__6 : rule__Station__Group__6__Impl rule__Station__Group__7 ;
    public final void rule__Station__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1703:1: ( rule__Station__Group__6__Impl rule__Station__Group__7 )
            // InternalCityDsl.g:1704:2: rule__Station__Group__6__Impl rule__Station__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__Station__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Station__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__6"


    // $ANTLR start "rule__Station__Group__6__Impl"
    // InternalCityDsl.g:1711:1: rule__Station__Group__6__Impl : ( ( rule__Station__DisabledAccessAssignment_6 )? ) ;
    public final void rule__Station__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1715:1: ( ( ( rule__Station__DisabledAccessAssignment_6 )? ) )
            // InternalCityDsl.g:1716:1: ( ( rule__Station__DisabledAccessAssignment_6 )? )
            {
            // InternalCityDsl.g:1716:1: ( ( rule__Station__DisabledAccessAssignment_6 )? )
            // InternalCityDsl.g:1717:2: ( rule__Station__DisabledAccessAssignment_6 )?
            {
             before(grammarAccess.getStationAccess().getDisabledAccessAssignment_6()); 
            // InternalCityDsl.g:1718:2: ( rule__Station__DisabledAccessAssignment_6 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==43) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCityDsl.g:1718:3: rule__Station__DisabledAccessAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Station__DisabledAccessAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStationAccess().getDisabledAccessAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__6__Impl"


    // $ANTLR start "rule__Station__Group__7"
    // InternalCityDsl.g:1726:1: rule__Station__Group__7 : rule__Station__Group__7__Impl rule__Station__Group__8 ;
    public final void rule__Station__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1730:1: ( rule__Station__Group__7__Impl rule__Station__Group__8 )
            // InternalCityDsl.g:1731:2: rule__Station__Group__7__Impl rule__Station__Group__8
            {
            pushFollow(FOLLOW_22);
            rule__Station__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Station__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__7"


    // $ANTLR start "rule__Station__Group__7__Impl"
    // InternalCityDsl.g:1738:1: rule__Station__Group__7__Impl : ( 'type' ) ;
    public final void rule__Station__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1742:1: ( ( 'type' ) )
            // InternalCityDsl.g:1743:1: ( 'type' )
            {
            // InternalCityDsl.g:1743:1: ( 'type' )
            // InternalCityDsl.g:1744:2: 'type'
            {
             before(grammarAccess.getStationAccess().getTypeKeyword_7()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getStationAccess().getTypeKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__7__Impl"


    // $ANTLR start "rule__Station__Group__8"
    // InternalCityDsl.g:1753:1: rule__Station__Group__8 : rule__Station__Group__8__Impl rule__Station__Group__9 ;
    public final void rule__Station__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1757:1: ( rule__Station__Group__8__Impl rule__Station__Group__9 )
            // InternalCityDsl.g:1758:2: rule__Station__Group__8__Impl rule__Station__Group__9
            {
            pushFollow(FOLLOW_23);
            rule__Station__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Station__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__8"


    // $ANTLR start "rule__Station__Group__8__Impl"
    // InternalCityDsl.g:1765:1: rule__Station__Group__8__Impl : ( ( rule__Station__TypeAssignment_8 ) ) ;
    public final void rule__Station__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1769:1: ( ( ( rule__Station__TypeAssignment_8 ) ) )
            // InternalCityDsl.g:1770:1: ( ( rule__Station__TypeAssignment_8 ) )
            {
            // InternalCityDsl.g:1770:1: ( ( rule__Station__TypeAssignment_8 ) )
            // InternalCityDsl.g:1771:2: ( rule__Station__TypeAssignment_8 )
            {
             before(grammarAccess.getStationAccess().getTypeAssignment_8()); 
            // InternalCityDsl.g:1772:2: ( rule__Station__TypeAssignment_8 )
            // InternalCityDsl.g:1772:3: rule__Station__TypeAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Station__TypeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getStationAccess().getTypeAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__8__Impl"


    // $ANTLR start "rule__Station__Group__9"
    // InternalCityDsl.g:1780:1: rule__Station__Group__9 : rule__Station__Group__9__Impl rule__Station__Group__10 ;
    public final void rule__Station__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1784:1: ( rule__Station__Group__9__Impl rule__Station__Group__10 )
            // InternalCityDsl.g:1785:2: rule__Station__Group__9__Impl rule__Station__Group__10
            {
            pushFollow(FOLLOW_23);
            rule__Station__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Station__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__9"


    // $ANTLR start "rule__Station__Group__9__Impl"
    // InternalCityDsl.g:1792:1: rule__Station__Group__9__Impl : ( ( rule__Station__Group_9__0 )* ) ;
    public final void rule__Station__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1796:1: ( ( ( rule__Station__Group_9__0 )* ) )
            // InternalCityDsl.g:1797:1: ( ( rule__Station__Group_9__0 )* )
            {
            // InternalCityDsl.g:1797:1: ( ( rule__Station__Group_9__0 )* )
            // InternalCityDsl.g:1798:2: ( rule__Station__Group_9__0 )*
            {
             before(grammarAccess.getStationAccess().getGroup_9()); 
            // InternalCityDsl.g:1799:2: ( rule__Station__Group_9__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==33) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalCityDsl.g:1799:3: rule__Station__Group_9__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Station__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getStationAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__9__Impl"


    // $ANTLR start "rule__Station__Group__10"
    // InternalCityDsl.g:1807:1: rule__Station__Group__10 : rule__Station__Group__10__Impl rule__Station__Group__11 ;
    public final void rule__Station__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1811:1: ( rule__Station__Group__10__Impl rule__Station__Group__11 )
            // InternalCityDsl.g:1812:2: rule__Station__Group__10__Impl rule__Station__Group__11
            {
            pushFollow(FOLLOW_23);
            rule__Station__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Station__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__10"


    // $ANTLR start "rule__Station__Group__10__Impl"
    // InternalCityDsl.g:1819:1: rule__Station__Group__10__Impl : ( ( rule__Station__Group_10__0 )? ) ;
    public final void rule__Station__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1823:1: ( ( ( rule__Station__Group_10__0 )? ) )
            // InternalCityDsl.g:1824:1: ( ( rule__Station__Group_10__0 )? )
            {
            // InternalCityDsl.g:1824:1: ( ( rule__Station__Group_10__0 )? )
            // InternalCityDsl.g:1825:2: ( rule__Station__Group_10__0 )?
            {
             before(grammarAccess.getStationAccess().getGroup_10()); 
            // InternalCityDsl.g:1826:2: ( rule__Station__Group_10__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCityDsl.g:1826:3: rule__Station__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Station__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStationAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__10__Impl"


    // $ANTLR start "rule__Station__Group__11"
    // InternalCityDsl.g:1834:1: rule__Station__Group__11 : rule__Station__Group__11__Impl rule__Station__Group__12 ;
    public final void rule__Station__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1838:1: ( rule__Station__Group__11__Impl rule__Station__Group__12 )
            // InternalCityDsl.g:1839:2: rule__Station__Group__11__Impl rule__Station__Group__12
            {
            pushFollow(FOLLOW_23);
            rule__Station__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Station__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__11"


    // $ANTLR start "rule__Station__Group__11__Impl"
    // InternalCityDsl.g:1846:1: rule__Station__Group__11__Impl : ( ( rule__Station__Group_11__0 )? ) ;
    public final void rule__Station__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1850:1: ( ( ( rule__Station__Group_11__0 )? ) )
            // InternalCityDsl.g:1851:1: ( ( rule__Station__Group_11__0 )? )
            {
            // InternalCityDsl.g:1851:1: ( ( rule__Station__Group_11__0 )? )
            // InternalCityDsl.g:1852:2: ( rule__Station__Group_11__0 )?
            {
             before(grammarAccess.getStationAccess().getGroup_11()); 
            // InternalCityDsl.g:1853:2: ( rule__Station__Group_11__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCityDsl.g:1853:3: rule__Station__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Station__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStationAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__11__Impl"


    // $ANTLR start "rule__Station__Group__12"
    // InternalCityDsl.g:1861:1: rule__Station__Group__12 : rule__Station__Group__12__Impl rule__Station__Group__13 ;
    public final void rule__Station__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1865:1: ( rule__Station__Group__12__Impl rule__Station__Group__13 )
            // InternalCityDsl.g:1866:2: rule__Station__Group__12__Impl rule__Station__Group__13
            {
            pushFollow(FOLLOW_23);
            rule__Station__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Station__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__12"


    // $ANTLR start "rule__Station__Group__12__Impl"
    // InternalCityDsl.g:1873:1: rule__Station__Group__12__Impl : ( ( rule__Station__Group_12__0 )? ) ;
    public final void rule__Station__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1877:1: ( ( ( rule__Station__Group_12__0 )? ) )
            // InternalCityDsl.g:1878:1: ( ( rule__Station__Group_12__0 )? )
            {
            // InternalCityDsl.g:1878:1: ( ( rule__Station__Group_12__0 )? )
            // InternalCityDsl.g:1879:2: ( rule__Station__Group_12__0 )?
            {
             before(grammarAccess.getStationAccess().getGroup_12()); 
            // InternalCityDsl.g:1880:2: ( rule__Station__Group_12__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCityDsl.g:1880:3: rule__Station__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Station__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStationAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__12__Impl"


    // $ANTLR start "rule__Station__Group__13"
    // InternalCityDsl.g:1888:1: rule__Station__Group__13 : rule__Station__Group__13__Impl ;
    public final void rule__Station__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1892:1: ( rule__Station__Group__13__Impl )
            // InternalCityDsl.g:1893:2: rule__Station__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Station__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__13"


    // $ANTLR start "rule__Station__Group__13__Impl"
    // InternalCityDsl.g:1899:1: rule__Station__Group__13__Impl : ( '}' ) ;
    public final void rule__Station__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1903:1: ( ( '}' ) )
            // InternalCityDsl.g:1904:1: ( '}' )
            {
            // InternalCityDsl.g:1904:1: ( '}' )
            // InternalCityDsl.g:1905:2: '}'
            {
             before(grammarAccess.getStationAccess().getRightCurlyBracketKeyword_13()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getStationAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group__13__Impl"


    // $ANTLR start "rule__Station__Group_3__0"
    // InternalCityDsl.g:1915:1: rule__Station__Group_3__0 : rule__Station__Group_3__0__Impl rule__Station__Group_3__1 ;
    public final void rule__Station__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1919:1: ( rule__Station__Group_3__0__Impl rule__Station__Group_3__1 )
            // InternalCityDsl.g:1920:2: rule__Station__Group_3__0__Impl rule__Station__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Station__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Station__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_3__0"


    // $ANTLR start "rule__Station__Group_3__0__Impl"
    // InternalCityDsl.g:1927:1: rule__Station__Group_3__0__Impl : ( 'location' ) ;
    public final void rule__Station__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1931:1: ( ( 'location' ) )
            // InternalCityDsl.g:1932:1: ( 'location' )
            {
            // InternalCityDsl.g:1932:1: ( 'location' )
            // InternalCityDsl.g:1933:2: 'location'
            {
             before(grammarAccess.getStationAccess().getLocationKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getStationAccess().getLocationKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_3__0__Impl"


    // $ANTLR start "rule__Station__Group_3__1"
    // InternalCityDsl.g:1942:1: rule__Station__Group_3__1 : rule__Station__Group_3__1__Impl rule__Station__Group_3__2 ;
    public final void rule__Station__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1946:1: ( rule__Station__Group_3__1__Impl rule__Station__Group_3__2 )
            // InternalCityDsl.g:1947:2: rule__Station__Group_3__1__Impl rule__Station__Group_3__2
            {
            pushFollow(FOLLOW_8);
            rule__Station__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Station__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_3__1"


    // $ANTLR start "rule__Station__Group_3__1__Impl"
    // InternalCityDsl.g:1954:1: rule__Station__Group_3__1__Impl : ( '(' ) ;
    public final void rule__Station__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1958:1: ( ( '(' ) )
            // InternalCityDsl.g:1959:1: ( '(' )
            {
            // InternalCityDsl.g:1959:1: ( '(' )
            // InternalCityDsl.g:1960:2: '('
            {
             before(grammarAccess.getStationAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStationAccess().getLeftParenthesisKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_3__1__Impl"


    // $ANTLR start "rule__Station__Group_3__2"
    // InternalCityDsl.g:1969:1: rule__Station__Group_3__2 : rule__Station__Group_3__2__Impl rule__Station__Group_3__3 ;
    public final void rule__Station__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1973:1: ( rule__Station__Group_3__2__Impl rule__Station__Group_3__3 )
            // InternalCityDsl.g:1974:2: rule__Station__Group_3__2__Impl rule__Station__Group_3__3
            {
            pushFollow(FOLLOW_9);
            rule__Station__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Station__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_3__2"


    // $ANTLR start "rule__Station__Group_3__2__Impl"
    // InternalCityDsl.g:1981:1: rule__Station__Group_3__2__Impl : ( ( rule__Station__Group_3_2__0 ) ) ;
    public final void rule__Station__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:1985:1: ( ( ( rule__Station__Group_3_2__0 ) ) )
            // InternalCityDsl.g:1986:1: ( ( rule__Station__Group_3_2__0 ) )
            {
            // InternalCityDsl.g:1986:1: ( ( rule__Station__Group_3_2__0 ) )
            // InternalCityDsl.g:1987:2: ( rule__Station__Group_3_2__0 )
            {
             before(grammarAccess.getStationAccess().getGroup_3_2()); 
            // InternalCityDsl.g:1988:2: ( rule__Station__Group_3_2__0 )
            // InternalCityDsl.g:1988:3: rule__Station__Group_3_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Station__Group_3_2__0();

            state._fsp--;


            }

             after(grammarAccess.getStationAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_3__2__Impl"


    // $ANTLR start "rule__Station__Group_3__3"
    // InternalCityDsl.g:1996:1: rule__Station__Group_3__3 : rule__Station__Group_3__3__Impl rule__Station__Group_3__4 ;
    public final void rule__Station__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2000:1: ( rule__Station__Group_3__3__Impl rule__Station__Group_3__4 )
            // InternalCityDsl.g:2001:2: rule__Station__Group_3__3__Impl rule__Station__Group_3__4
            {
            pushFollow(FOLLOW_10);
            rule__Station__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Station__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_3__3"


    // $ANTLR start "rule__Station__Group_3__3__Impl"
    // InternalCityDsl.g:2008:1: rule__Station__Group_3__3__Impl : ( ( rule__Station__Group_3_3__0 ) ) ;
    public final void rule__Station__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2012:1: ( ( ( rule__Station__Group_3_3__0 ) ) )
            // InternalCityDsl.g:2013:1: ( ( rule__Station__Group_3_3__0 ) )
            {
            // InternalCityDsl.g:2013:1: ( ( rule__Station__Group_3_3__0 ) )
            // InternalCityDsl.g:2014:2: ( rule__Station__Group_3_3__0 )
            {
             before(grammarAccess.getStationAccess().getGroup_3_3()); 
            // InternalCityDsl.g:2015:2: ( rule__Station__Group_3_3__0 )
            // InternalCityDsl.g:2015:3: rule__Station__Group_3_3__0
            {
            pushFollow(FOLLOW_2);
            rule__Station__Group_3_3__0();

            state._fsp--;


            }

             after(grammarAccess.getStationAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_3__3__Impl"


    // $ANTLR start "rule__Station__Group_3__4"
    // InternalCityDsl.g:2023:1: rule__Station__Group_3__4 : rule__Station__Group_3__4__Impl rule__Station__Group_3__5 ;
    public final void rule__Station__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2027:1: ( rule__Station__Group_3__4__Impl rule__Station__Group_3__5 )
            // InternalCityDsl.g:2028:2: rule__Station__Group_3__4__Impl rule__Station__Group_3__5
            {
            pushFollow(FOLLOW_11);
            rule__Station__Group_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Station__Group_3__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_3__4"


    // $ANTLR start "rule__Station__Group_3__4__Impl"
    // InternalCityDsl.g:2035:1: rule__Station__Group_3__4__Impl : ( ( rule__Station__Group_3_4__0 ) ) ;
    public final void rule__Station__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2039:1: ( ( ( rule__Station__Group_3_4__0 ) ) )
            // InternalCityDsl.g:2040:1: ( ( rule__Station__Group_3_4__0 ) )
            {
            // InternalCityDsl.g:2040:1: ( ( rule__Station__Group_3_4__0 ) )
            // InternalCityDsl.g:2041:2: ( rule__Station__Group_3_4__0 )
            {
             before(grammarAccess.getStationAccess().getGroup_3_4()); 
            // InternalCityDsl.g:2042:2: ( rule__Station__Group_3_4__0 )
            // InternalCityDsl.g:2042:3: rule__Station__Group_3_4__0
            {
            pushFollow(FOLLOW_2);
            rule__Station__Group_3_4__0();

            state._fsp--;


            }

             after(grammarAccess.getStationAccess().getGroup_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_3__4__Impl"


    // $ANTLR start "rule__Station__Group_3__5"
    // InternalCityDsl.g:2050:1: rule__Station__Group_3__5 : rule__Station__Group_3__5__Impl ;
    public final void rule__Station__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2054:1: ( rule__Station__Group_3__5__Impl )
            // InternalCityDsl.g:2055:2: rule__Station__Group_3__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Station__Group_3__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_3__5"


    // $ANTLR start "rule__Station__Group_3__5__Impl"
    // InternalCityDsl.g:2061:1: rule__Station__Group_3__5__Impl : ( ')' ) ;
    public final void rule__Station__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2065:1: ( ( ')' ) )
            // InternalCityDsl.g:2066:1: ( ')' )
            {
            // InternalCityDsl.g:2066:1: ( ')' )
            // InternalCityDsl.g:2067:2: ')'
            {
             before(grammarAccess.getStationAccess().getRightParenthesisKeyword_3_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getStationAccess().getRightParenthesisKeyword_3_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_3__5__Impl"


    // $ANTLR start "rule__Station__Group_3_2__0"
    // InternalCityDsl.g:2077:1: rule__Station__Group_3_2__0 : rule__Station__Group_3_2__0__Impl rule__Station__Group_3_2__1 ;
    public final void rule__Station__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2081:1: ( rule__Station__Group_3_2__0__Impl rule__Station__Group_3_2__1 )
            // InternalCityDsl.g:2082:2: rule__Station__Group_3_2__0__Impl rule__Station__Group_3_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Station__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Station__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_3_2__0"


    // $ANTLR start "rule__Station__Group_3_2__0__Impl"
    // InternalCityDsl.g:2089:1: rule__Station__Group_3_2__0__Impl : ( 'longitude' ) ;
    public final void rule__Station__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2093:1: ( ( 'longitude' ) )
            // InternalCityDsl.g:2094:1: ( 'longitude' )
            {
            // InternalCityDsl.g:2094:1: ( 'longitude' )
            // InternalCityDsl.g:2095:2: 'longitude'
            {
             before(grammarAccess.getStationAccess().getLongitudeKeyword_3_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStationAccess().getLongitudeKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_3_2__0__Impl"


    // $ANTLR start "rule__Station__Group_3_2__1"
    // InternalCityDsl.g:2104:1: rule__Station__Group_3_2__1 : rule__Station__Group_3_2__1__Impl ;
    public final void rule__Station__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2108:1: ( rule__Station__Group_3_2__1__Impl )
            // InternalCityDsl.g:2109:2: rule__Station__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Station__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_3_2__1"


    // $ANTLR start "rule__Station__Group_3_2__1__Impl"
    // InternalCityDsl.g:2115:1: rule__Station__Group_3_2__1__Impl : ( ( rule__Station__LongitudeAssignment_3_2_1 ) ) ;
    public final void rule__Station__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2119:1: ( ( ( rule__Station__LongitudeAssignment_3_2_1 ) ) )
            // InternalCityDsl.g:2120:1: ( ( rule__Station__LongitudeAssignment_3_2_1 ) )
            {
            // InternalCityDsl.g:2120:1: ( ( rule__Station__LongitudeAssignment_3_2_1 ) )
            // InternalCityDsl.g:2121:2: ( rule__Station__LongitudeAssignment_3_2_1 )
            {
             before(grammarAccess.getStationAccess().getLongitudeAssignment_3_2_1()); 
            // InternalCityDsl.g:2122:2: ( rule__Station__LongitudeAssignment_3_2_1 )
            // InternalCityDsl.g:2122:3: rule__Station__LongitudeAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Station__LongitudeAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStationAccess().getLongitudeAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_3_2__1__Impl"


    // $ANTLR start "rule__Station__Group_3_3__0"
    // InternalCityDsl.g:2131:1: rule__Station__Group_3_3__0 : rule__Station__Group_3_3__0__Impl rule__Station__Group_3_3__1 ;
    public final void rule__Station__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2135:1: ( rule__Station__Group_3_3__0__Impl rule__Station__Group_3_3__1 )
            // InternalCityDsl.g:2136:2: rule__Station__Group_3_3__0__Impl rule__Station__Group_3_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Station__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Station__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_3_3__0"


    // $ANTLR start "rule__Station__Group_3_3__0__Impl"
    // InternalCityDsl.g:2143:1: rule__Station__Group_3_3__0__Impl : ( 'latitude' ) ;
    public final void rule__Station__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2147:1: ( ( 'latitude' ) )
            // InternalCityDsl.g:2148:1: ( 'latitude' )
            {
            // InternalCityDsl.g:2148:1: ( 'latitude' )
            // InternalCityDsl.g:2149:2: 'latitude'
            {
             before(grammarAccess.getStationAccess().getLatitudeKeyword_3_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStationAccess().getLatitudeKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_3_3__0__Impl"


    // $ANTLR start "rule__Station__Group_3_3__1"
    // InternalCityDsl.g:2158:1: rule__Station__Group_3_3__1 : rule__Station__Group_3_3__1__Impl ;
    public final void rule__Station__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2162:1: ( rule__Station__Group_3_3__1__Impl )
            // InternalCityDsl.g:2163:2: rule__Station__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Station__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_3_3__1"


    // $ANTLR start "rule__Station__Group_3_3__1__Impl"
    // InternalCityDsl.g:2169:1: rule__Station__Group_3_3__1__Impl : ( ( rule__Station__LatitudeAssignment_3_3_1 ) ) ;
    public final void rule__Station__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2173:1: ( ( ( rule__Station__LatitudeAssignment_3_3_1 ) ) )
            // InternalCityDsl.g:2174:1: ( ( rule__Station__LatitudeAssignment_3_3_1 ) )
            {
            // InternalCityDsl.g:2174:1: ( ( rule__Station__LatitudeAssignment_3_3_1 ) )
            // InternalCityDsl.g:2175:2: ( rule__Station__LatitudeAssignment_3_3_1 )
            {
             before(grammarAccess.getStationAccess().getLatitudeAssignment_3_3_1()); 
            // InternalCityDsl.g:2176:2: ( rule__Station__LatitudeAssignment_3_3_1 )
            // InternalCityDsl.g:2176:3: rule__Station__LatitudeAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Station__LatitudeAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStationAccess().getLatitudeAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_3_3__1__Impl"


    // $ANTLR start "rule__Station__Group_3_4__0"
    // InternalCityDsl.g:2185:1: rule__Station__Group_3_4__0 : rule__Station__Group_3_4__0__Impl rule__Station__Group_3_4__1 ;
    public final void rule__Station__Group_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2189:1: ( rule__Station__Group_3_4__0__Impl rule__Station__Group_3_4__1 )
            // InternalCityDsl.g:2190:2: rule__Station__Group_3_4__0__Impl rule__Station__Group_3_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Station__Group_3_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Station__Group_3_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_3_4__0"


    // $ANTLR start "rule__Station__Group_3_4__0__Impl"
    // InternalCityDsl.g:2197:1: rule__Station__Group_3_4__0__Impl : ( 'altitude' ) ;
    public final void rule__Station__Group_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2201:1: ( ( 'altitude' ) )
            // InternalCityDsl.g:2202:1: ( 'altitude' )
            {
            // InternalCityDsl.g:2202:1: ( 'altitude' )
            // InternalCityDsl.g:2203:2: 'altitude'
            {
             before(grammarAccess.getStationAccess().getAltitudeKeyword_3_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStationAccess().getAltitudeKeyword_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_3_4__0__Impl"


    // $ANTLR start "rule__Station__Group_3_4__1"
    // InternalCityDsl.g:2212:1: rule__Station__Group_3_4__1 : rule__Station__Group_3_4__1__Impl ;
    public final void rule__Station__Group_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2216:1: ( rule__Station__Group_3_4__1__Impl )
            // InternalCityDsl.g:2217:2: rule__Station__Group_3_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Station__Group_3_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_3_4__1"


    // $ANTLR start "rule__Station__Group_3_4__1__Impl"
    // InternalCityDsl.g:2223:1: rule__Station__Group_3_4__1__Impl : ( ( rule__Station__AltitudeAssignment_3_4_1 ) ) ;
    public final void rule__Station__Group_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2227:1: ( ( ( rule__Station__AltitudeAssignment_3_4_1 ) ) )
            // InternalCityDsl.g:2228:1: ( ( rule__Station__AltitudeAssignment_3_4_1 ) )
            {
            // InternalCityDsl.g:2228:1: ( ( rule__Station__AltitudeAssignment_3_4_1 ) )
            // InternalCityDsl.g:2229:2: ( rule__Station__AltitudeAssignment_3_4_1 )
            {
             before(grammarAccess.getStationAccess().getAltitudeAssignment_3_4_1()); 
            // InternalCityDsl.g:2230:2: ( rule__Station__AltitudeAssignment_3_4_1 )
            // InternalCityDsl.g:2230:3: rule__Station__AltitudeAssignment_3_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Station__AltitudeAssignment_3_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStationAccess().getAltitudeAssignment_3_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_3_4__1__Impl"


    // $ANTLR start "rule__Station__Group_9__0"
    // InternalCityDsl.g:2239:1: rule__Station__Group_9__0 : rule__Station__Group_9__0__Impl rule__Station__Group_9__1 ;
    public final void rule__Station__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2243:1: ( rule__Station__Group_9__0__Impl rule__Station__Group_9__1 )
            // InternalCityDsl.g:2244:2: rule__Station__Group_9__0__Impl rule__Station__Group_9__1
            {
            pushFollow(FOLLOW_22);
            rule__Station__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Station__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_9__0"


    // $ANTLR start "rule__Station__Group_9__0__Impl"
    // InternalCityDsl.g:2251:1: rule__Station__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Station__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2255:1: ( ( ',' ) )
            // InternalCityDsl.g:2256:1: ( ',' )
            {
            // InternalCityDsl.g:2256:1: ( ',' )
            // InternalCityDsl.g:2257:2: ','
            {
             before(grammarAccess.getStationAccess().getCommaKeyword_9_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getStationAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_9__0__Impl"


    // $ANTLR start "rule__Station__Group_9__1"
    // InternalCityDsl.g:2266:1: rule__Station__Group_9__1 : rule__Station__Group_9__1__Impl ;
    public final void rule__Station__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2270:1: ( rule__Station__Group_9__1__Impl )
            // InternalCityDsl.g:2271:2: rule__Station__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Station__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_9__1"


    // $ANTLR start "rule__Station__Group_9__1__Impl"
    // InternalCityDsl.g:2277:1: rule__Station__Group_9__1__Impl : ( ( rule__Station__TypeAssignment_9_1 ) ) ;
    public final void rule__Station__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2281:1: ( ( ( rule__Station__TypeAssignment_9_1 ) ) )
            // InternalCityDsl.g:2282:1: ( ( rule__Station__TypeAssignment_9_1 ) )
            {
            // InternalCityDsl.g:2282:1: ( ( rule__Station__TypeAssignment_9_1 ) )
            // InternalCityDsl.g:2283:2: ( rule__Station__TypeAssignment_9_1 )
            {
             before(grammarAccess.getStationAccess().getTypeAssignment_9_1()); 
            // InternalCityDsl.g:2284:2: ( rule__Station__TypeAssignment_9_1 )
            // InternalCityDsl.g:2284:3: rule__Station__TypeAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Station__TypeAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getStationAccess().getTypeAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_9__1__Impl"


    // $ANTLR start "rule__Station__Group_10__0"
    // InternalCityDsl.g:2293:1: rule__Station__Group_10__0 : rule__Station__Group_10__0__Impl rule__Station__Group_10__1 ;
    public final void rule__Station__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2297:1: ( rule__Station__Group_10__0__Impl rule__Station__Group_10__1 )
            // InternalCityDsl.g:2298:2: rule__Station__Group_10__0__Impl rule__Station__Group_10__1
            {
            pushFollow(FOLLOW_19);
            rule__Station__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Station__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_10__0"


    // $ANTLR start "rule__Station__Group_10__0__Impl"
    // InternalCityDsl.g:2305:1: rule__Station__Group_10__0__Impl : ( 'nbOfTicketMachines' ) ;
    public final void rule__Station__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2309:1: ( ( 'nbOfTicketMachines' ) )
            // InternalCityDsl.g:2310:1: ( 'nbOfTicketMachines' )
            {
            // InternalCityDsl.g:2310:1: ( 'nbOfTicketMachines' )
            // InternalCityDsl.g:2311:2: 'nbOfTicketMachines'
            {
             before(grammarAccess.getStationAccess().getNbOfTicketMachinesKeyword_10_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getStationAccess().getNbOfTicketMachinesKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_10__0__Impl"


    // $ANTLR start "rule__Station__Group_10__1"
    // InternalCityDsl.g:2320:1: rule__Station__Group_10__1 : rule__Station__Group_10__1__Impl ;
    public final void rule__Station__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2324:1: ( rule__Station__Group_10__1__Impl )
            // InternalCityDsl.g:2325:2: rule__Station__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Station__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_10__1"


    // $ANTLR start "rule__Station__Group_10__1__Impl"
    // InternalCityDsl.g:2331:1: rule__Station__Group_10__1__Impl : ( ( rule__Station__NbOfTicketMachinesAssignment_10_1 ) ) ;
    public final void rule__Station__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2335:1: ( ( ( rule__Station__NbOfTicketMachinesAssignment_10_1 ) ) )
            // InternalCityDsl.g:2336:1: ( ( rule__Station__NbOfTicketMachinesAssignment_10_1 ) )
            {
            // InternalCityDsl.g:2336:1: ( ( rule__Station__NbOfTicketMachinesAssignment_10_1 ) )
            // InternalCityDsl.g:2337:2: ( rule__Station__NbOfTicketMachinesAssignment_10_1 )
            {
             before(grammarAccess.getStationAccess().getNbOfTicketMachinesAssignment_10_1()); 
            // InternalCityDsl.g:2338:2: ( rule__Station__NbOfTicketMachinesAssignment_10_1 )
            // InternalCityDsl.g:2338:3: rule__Station__NbOfTicketMachinesAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Station__NbOfTicketMachinesAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getStationAccess().getNbOfTicketMachinesAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_10__1__Impl"


    // $ANTLR start "rule__Station__Group_11__0"
    // InternalCityDsl.g:2347:1: rule__Station__Group_11__0 : rule__Station__Group_11__0__Impl rule__Station__Group_11__1 ;
    public final void rule__Station__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2351:1: ( rule__Station__Group_11__0__Impl rule__Station__Group_11__1 )
            // InternalCityDsl.g:2352:2: rule__Station__Group_11__0__Impl rule__Station__Group_11__1
            {
            pushFollow(FOLLOW_19);
            rule__Station__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Station__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_11__0"


    // $ANTLR start "rule__Station__Group_11__0__Impl"
    // InternalCityDsl.g:2359:1: rule__Station__Group_11__0__Impl : ( 'nbOfElevators' ) ;
    public final void rule__Station__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2363:1: ( ( 'nbOfElevators' ) )
            // InternalCityDsl.g:2364:1: ( 'nbOfElevators' )
            {
            // InternalCityDsl.g:2364:1: ( 'nbOfElevators' )
            // InternalCityDsl.g:2365:2: 'nbOfElevators'
            {
             before(grammarAccess.getStationAccess().getNbOfElevatorsKeyword_11_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getStationAccess().getNbOfElevatorsKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_11__0__Impl"


    // $ANTLR start "rule__Station__Group_11__1"
    // InternalCityDsl.g:2374:1: rule__Station__Group_11__1 : rule__Station__Group_11__1__Impl ;
    public final void rule__Station__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2378:1: ( rule__Station__Group_11__1__Impl )
            // InternalCityDsl.g:2379:2: rule__Station__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Station__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_11__1"


    // $ANTLR start "rule__Station__Group_11__1__Impl"
    // InternalCityDsl.g:2385:1: rule__Station__Group_11__1__Impl : ( ( rule__Station__NbOfElevatorsAssignment_11_1 ) ) ;
    public final void rule__Station__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2389:1: ( ( ( rule__Station__NbOfElevatorsAssignment_11_1 ) ) )
            // InternalCityDsl.g:2390:1: ( ( rule__Station__NbOfElevatorsAssignment_11_1 ) )
            {
            // InternalCityDsl.g:2390:1: ( ( rule__Station__NbOfElevatorsAssignment_11_1 ) )
            // InternalCityDsl.g:2391:2: ( rule__Station__NbOfElevatorsAssignment_11_1 )
            {
             before(grammarAccess.getStationAccess().getNbOfElevatorsAssignment_11_1()); 
            // InternalCityDsl.g:2392:2: ( rule__Station__NbOfElevatorsAssignment_11_1 )
            // InternalCityDsl.g:2392:3: rule__Station__NbOfElevatorsAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Station__NbOfElevatorsAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getStationAccess().getNbOfElevatorsAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_11__1__Impl"


    // $ANTLR start "rule__Station__Group_12__0"
    // InternalCityDsl.g:2401:1: rule__Station__Group_12__0 : rule__Station__Group_12__0__Impl rule__Station__Group_12__1 ;
    public final void rule__Station__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2405:1: ( rule__Station__Group_12__0__Impl rule__Station__Group_12__1 )
            // InternalCityDsl.g:2406:2: rule__Station__Group_12__0__Impl rule__Station__Group_12__1
            {
            pushFollow(FOLLOW_19);
            rule__Station__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Station__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_12__0"


    // $ANTLR start "rule__Station__Group_12__0__Impl"
    // InternalCityDsl.g:2413:1: rule__Station__Group_12__0__Impl : ( 'zone' ) ;
    public final void rule__Station__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2417:1: ( ( 'zone' ) )
            // InternalCityDsl.g:2418:1: ( 'zone' )
            {
            // InternalCityDsl.g:2418:1: ( 'zone' )
            // InternalCityDsl.g:2419:2: 'zone'
            {
             before(grammarAccess.getStationAccess().getZoneKeyword_12_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getStationAccess().getZoneKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_12__0__Impl"


    // $ANTLR start "rule__Station__Group_12__1"
    // InternalCityDsl.g:2428:1: rule__Station__Group_12__1 : rule__Station__Group_12__1__Impl ;
    public final void rule__Station__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2432:1: ( rule__Station__Group_12__1__Impl )
            // InternalCityDsl.g:2433:2: rule__Station__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Station__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_12__1"


    // $ANTLR start "rule__Station__Group_12__1__Impl"
    // InternalCityDsl.g:2439:1: rule__Station__Group_12__1__Impl : ( ( rule__Station__ZoneAssignment_12_1 ) ) ;
    public final void rule__Station__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2443:1: ( ( ( rule__Station__ZoneAssignment_12_1 ) ) )
            // InternalCityDsl.g:2444:1: ( ( rule__Station__ZoneAssignment_12_1 ) )
            {
            // InternalCityDsl.g:2444:1: ( ( rule__Station__ZoneAssignment_12_1 ) )
            // InternalCityDsl.g:2445:2: ( rule__Station__ZoneAssignment_12_1 )
            {
             before(grammarAccess.getStationAccess().getZoneAssignment_12_1()); 
            // InternalCityDsl.g:2446:2: ( rule__Station__ZoneAssignment_12_1 )
            // InternalCityDsl.g:2446:3: rule__Station__ZoneAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__Station__ZoneAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getStationAccess().getZoneAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__Group_12__1__Impl"


    // $ANTLR start "rule__Line__Group__0"
    // InternalCityDsl.g:2455:1: rule__Line__Group__0 : rule__Line__Group__0__Impl rule__Line__Group__1 ;
    public final void rule__Line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2459:1: ( rule__Line__Group__0__Impl rule__Line__Group__1 )
            // InternalCityDsl.g:2460:2: rule__Line__Group__0__Impl rule__Line__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Line__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__0"


    // $ANTLR start "rule__Line__Group__0__Impl"
    // InternalCityDsl.g:2467:1: rule__Line__Group__0__Impl : ( () ) ;
    public final void rule__Line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2471:1: ( ( () ) )
            // InternalCityDsl.g:2472:1: ( () )
            {
            // InternalCityDsl.g:2472:1: ( () )
            // InternalCityDsl.g:2473:2: ()
            {
             before(grammarAccess.getLineAccess().getLineAction_0()); 
            // InternalCityDsl.g:2474:2: ()
            // InternalCityDsl.g:2474:3: 
            {
            }

             after(grammarAccess.getLineAccess().getLineAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__0__Impl"


    // $ANTLR start "rule__Line__Group__1"
    // InternalCityDsl.g:2482:1: rule__Line__Group__1 : rule__Line__Group__1__Impl rule__Line__Group__2 ;
    public final void rule__Line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2486:1: ( rule__Line__Group__1__Impl rule__Line__Group__2 )
            // InternalCityDsl.g:2487:2: rule__Line__Group__1__Impl rule__Line__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Line__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__1"


    // $ANTLR start "rule__Line__Group__1__Impl"
    // InternalCityDsl.g:2494:1: rule__Line__Group__1__Impl : ( 'Line' ) ;
    public final void rule__Line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2498:1: ( ( 'Line' ) )
            // InternalCityDsl.g:2499:1: ( 'Line' )
            {
            // InternalCityDsl.g:2499:1: ( 'Line' )
            // InternalCityDsl.g:2500:2: 'Line'
            {
             before(grammarAccess.getLineAccess().getLineKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getLineKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__1__Impl"


    // $ANTLR start "rule__Line__Group__2"
    // InternalCityDsl.g:2509:1: rule__Line__Group__2 : rule__Line__Group__2__Impl rule__Line__Group__3 ;
    public final void rule__Line__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2513:1: ( rule__Line__Group__2__Impl rule__Line__Group__3 )
            // InternalCityDsl.g:2514:2: rule__Line__Group__2__Impl rule__Line__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Line__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__2"


    // $ANTLR start "rule__Line__Group__2__Impl"
    // InternalCityDsl.g:2521:1: rule__Line__Group__2__Impl : ( ( rule__Line__NameAssignment_2 ) ) ;
    public final void rule__Line__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2525:1: ( ( ( rule__Line__NameAssignment_2 ) ) )
            // InternalCityDsl.g:2526:1: ( ( rule__Line__NameAssignment_2 ) )
            {
            // InternalCityDsl.g:2526:1: ( ( rule__Line__NameAssignment_2 ) )
            // InternalCityDsl.g:2527:2: ( rule__Line__NameAssignment_2 )
            {
             before(grammarAccess.getLineAccess().getNameAssignment_2()); 
            // InternalCityDsl.g:2528:2: ( rule__Line__NameAssignment_2 )
            // InternalCityDsl.g:2528:3: rule__Line__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Line__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__2__Impl"


    // $ANTLR start "rule__Line__Group__3"
    // InternalCityDsl.g:2536:1: rule__Line__Group__3 : rule__Line__Group__3__Impl rule__Line__Group__4 ;
    public final void rule__Line__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2540:1: ( rule__Line__Group__3__Impl rule__Line__Group__4 )
            // InternalCityDsl.g:2541:2: rule__Line__Group__3__Impl rule__Line__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Line__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__3"


    // $ANTLR start "rule__Line__Group__3__Impl"
    // InternalCityDsl.g:2548:1: rule__Line__Group__3__Impl : ( '{' ) ;
    public final void rule__Line__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2552:1: ( ( '{' ) )
            // InternalCityDsl.g:2553:1: ( '{' )
            {
            // InternalCityDsl.g:2553:1: ( '{' )
            // InternalCityDsl.g:2554:2: '{'
            {
             before(grammarAccess.getLineAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__3__Impl"


    // $ANTLR start "rule__Line__Group__4"
    // InternalCityDsl.g:2563:1: rule__Line__Group__4 : rule__Line__Group__4__Impl rule__Line__Group__5 ;
    public final void rule__Line__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2567:1: ( rule__Line__Group__4__Impl rule__Line__Group__5 )
            // InternalCityDsl.g:2568:2: rule__Line__Group__4__Impl rule__Line__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__Line__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__4"


    // $ANTLR start "rule__Line__Group__4__Impl"
    // InternalCityDsl.g:2575:1: rule__Line__Group__4__Impl : ( ( rule__Line__Group_4__0 )? ) ;
    public final void rule__Line__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2579:1: ( ( ( rule__Line__Group_4__0 )? ) )
            // InternalCityDsl.g:2580:1: ( ( rule__Line__Group_4__0 )? )
            {
            // InternalCityDsl.g:2580:1: ( ( rule__Line__Group_4__0 )? )
            // InternalCityDsl.g:2581:2: ( rule__Line__Group_4__0 )?
            {
             before(grammarAccess.getLineAccess().getGroup_4()); 
            // InternalCityDsl.g:2582:2: ( rule__Line__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCityDsl.g:2582:3: rule__Line__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Line__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__4__Impl"


    // $ANTLR start "rule__Line__Group__5"
    // InternalCityDsl.g:2590:1: rule__Line__Group__5 : rule__Line__Group__5__Impl rule__Line__Group__6 ;
    public final void rule__Line__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2594:1: ( rule__Line__Group__5__Impl rule__Line__Group__6 )
            // InternalCityDsl.g:2595:2: rule__Line__Group__5__Impl rule__Line__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__Line__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__5"


    // $ANTLR start "rule__Line__Group__5__Impl"
    // InternalCityDsl.g:2602:1: rule__Line__Group__5__Impl : ( ( rule__Line__Group_5__0 )? ) ;
    public final void rule__Line__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2606:1: ( ( ( rule__Line__Group_5__0 )? ) )
            // InternalCityDsl.g:2607:1: ( ( rule__Line__Group_5__0 )? )
            {
            // InternalCityDsl.g:2607:1: ( ( rule__Line__Group_5__0 )? )
            // InternalCityDsl.g:2608:2: ( rule__Line__Group_5__0 )?
            {
             before(grammarAccess.getLineAccess().getGroup_5()); 
            // InternalCityDsl.g:2609:2: ( rule__Line__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==39) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCityDsl.g:2609:3: rule__Line__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Line__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__5__Impl"


    // $ANTLR start "rule__Line__Group__6"
    // InternalCityDsl.g:2617:1: rule__Line__Group__6 : rule__Line__Group__6__Impl rule__Line__Group__7 ;
    public final void rule__Line__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2621:1: ( rule__Line__Group__6__Impl rule__Line__Group__7 )
            // InternalCityDsl.g:2622:2: rule__Line__Group__6__Impl rule__Line__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__Line__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__6"


    // $ANTLR start "rule__Line__Group__6__Impl"
    // InternalCityDsl.g:2629:1: rule__Line__Group__6__Impl : ( ( rule__Line__Group_6__0 )? ) ;
    public final void rule__Line__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2633:1: ( ( ( rule__Line__Group_6__0 )? ) )
            // InternalCityDsl.g:2634:1: ( ( rule__Line__Group_6__0 )? )
            {
            // InternalCityDsl.g:2634:1: ( ( rule__Line__Group_6__0 )? )
            // InternalCityDsl.g:2635:2: ( rule__Line__Group_6__0 )?
            {
             before(grammarAccess.getLineAccess().getGroup_6()); 
            // InternalCityDsl.g:2636:2: ( rule__Line__Group_6__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==40) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCityDsl.g:2636:3: rule__Line__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Line__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__6__Impl"


    // $ANTLR start "rule__Line__Group__7"
    // InternalCityDsl.g:2644:1: rule__Line__Group__7 : rule__Line__Group__7__Impl ;
    public final void rule__Line__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2648:1: ( rule__Line__Group__7__Impl )
            // InternalCityDsl.g:2649:2: rule__Line__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Line__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__7"


    // $ANTLR start "rule__Line__Group__7__Impl"
    // InternalCityDsl.g:2655:1: rule__Line__Group__7__Impl : ( '}' ) ;
    public final void rule__Line__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2659:1: ( ( '}' ) )
            // InternalCityDsl.g:2660:1: ( '}' )
            {
            // InternalCityDsl.g:2660:1: ( '}' )
            // InternalCityDsl.g:2661:2: '}'
            {
             before(grammarAccess.getLineAccess().getRightCurlyBracketKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__7__Impl"


    // $ANTLR start "rule__Line__Group_4__0"
    // InternalCityDsl.g:2671:1: rule__Line__Group_4__0 : rule__Line__Group_4__0__Impl rule__Line__Group_4__1 ;
    public final void rule__Line__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2675:1: ( rule__Line__Group_4__0__Impl rule__Line__Group_4__1 )
            // InternalCityDsl.g:2676:2: rule__Line__Group_4__0__Impl rule__Line__Group_4__1
            {
            pushFollow(FOLLOW_22);
            rule__Line__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_4__0"


    // $ANTLR start "rule__Line__Group_4__0__Impl"
    // InternalCityDsl.g:2683:1: rule__Line__Group_4__0__Impl : ( 'of' ) ;
    public final void rule__Line__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2687:1: ( ( 'of' ) )
            // InternalCityDsl.g:2688:1: ( 'of' )
            {
            // InternalCityDsl.g:2688:1: ( 'of' )
            // InternalCityDsl.g:2689:2: 'of'
            {
             before(grammarAccess.getLineAccess().getOfKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getOfKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_4__0__Impl"


    // $ANTLR start "rule__Line__Group_4__1"
    // InternalCityDsl.g:2698:1: rule__Line__Group_4__1 : rule__Line__Group_4__1__Impl ;
    public final void rule__Line__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2702:1: ( rule__Line__Group_4__1__Impl )
            // InternalCityDsl.g:2703:2: rule__Line__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Line__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_4__1"


    // $ANTLR start "rule__Line__Group_4__1__Impl"
    // InternalCityDsl.g:2709:1: rule__Line__Group_4__1__Impl : ( ( rule__Line__TypeAssignment_4_1 ) ) ;
    public final void rule__Line__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2713:1: ( ( ( rule__Line__TypeAssignment_4_1 ) ) )
            // InternalCityDsl.g:2714:1: ( ( rule__Line__TypeAssignment_4_1 ) )
            {
            // InternalCityDsl.g:2714:1: ( ( rule__Line__TypeAssignment_4_1 ) )
            // InternalCityDsl.g:2715:2: ( rule__Line__TypeAssignment_4_1 )
            {
             before(grammarAccess.getLineAccess().getTypeAssignment_4_1()); 
            // InternalCityDsl.g:2716:2: ( rule__Line__TypeAssignment_4_1 )
            // InternalCityDsl.g:2716:3: rule__Line__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Line__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_4__1__Impl"


    // $ANTLR start "rule__Line__Group_5__0"
    // InternalCityDsl.g:2725:1: rule__Line__Group_5__0 : rule__Line__Group_5__0__Impl rule__Line__Group_5__1 ;
    public final void rule__Line__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2729:1: ( rule__Line__Group_5__0__Impl rule__Line__Group_5__1 )
            // InternalCityDsl.g:2730:2: rule__Line__Group_5__0__Impl rule__Line__Group_5__1
            {
            pushFollow(FOLLOW_26);
            rule__Line__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_5__0"


    // $ANTLR start "rule__Line__Group_5__0__Impl"
    // InternalCityDsl.g:2737:1: rule__Line__Group_5__0__Impl : ( 'topology' ) ;
    public final void rule__Line__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2741:1: ( ( 'topology' ) )
            // InternalCityDsl.g:2742:1: ( 'topology' )
            {
            // InternalCityDsl.g:2742:1: ( 'topology' )
            // InternalCityDsl.g:2743:2: 'topology'
            {
             before(grammarAccess.getLineAccess().getTopologyKeyword_5_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getTopologyKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_5__0__Impl"


    // $ANTLR start "rule__Line__Group_5__1"
    // InternalCityDsl.g:2752:1: rule__Line__Group_5__1 : rule__Line__Group_5__1__Impl ;
    public final void rule__Line__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2756:1: ( rule__Line__Group_5__1__Impl )
            // InternalCityDsl.g:2757:2: rule__Line__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Line__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_5__1"


    // $ANTLR start "rule__Line__Group_5__1__Impl"
    // InternalCityDsl.g:2763:1: rule__Line__Group_5__1__Impl : ( ( rule__Line__TopologyAssignment_5_1 ) ) ;
    public final void rule__Line__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2767:1: ( ( ( rule__Line__TopologyAssignment_5_1 ) ) )
            // InternalCityDsl.g:2768:1: ( ( rule__Line__TopologyAssignment_5_1 ) )
            {
            // InternalCityDsl.g:2768:1: ( ( rule__Line__TopologyAssignment_5_1 ) )
            // InternalCityDsl.g:2769:2: ( rule__Line__TopologyAssignment_5_1 )
            {
             before(grammarAccess.getLineAccess().getTopologyAssignment_5_1()); 
            // InternalCityDsl.g:2770:2: ( rule__Line__TopologyAssignment_5_1 )
            // InternalCityDsl.g:2770:3: rule__Line__TopologyAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Line__TopologyAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getTopologyAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_5__1__Impl"


    // $ANTLR start "rule__Line__Group_6__0"
    // InternalCityDsl.g:2779:1: rule__Line__Group_6__0 : rule__Line__Group_6__0__Impl rule__Line__Group_6__1 ;
    public final void rule__Line__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2783:1: ( rule__Line__Group_6__0__Impl rule__Line__Group_6__1 )
            // InternalCityDsl.g:2784:2: rule__Line__Group_6__0__Impl rule__Line__Group_6__1
            {
            pushFollow(FOLLOW_7);
            rule__Line__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_6__0"


    // $ANTLR start "rule__Line__Group_6__0__Impl"
    // InternalCityDsl.g:2791:1: rule__Line__Group_6__0__Impl : ( 'stations' ) ;
    public final void rule__Line__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2795:1: ( ( 'stations' ) )
            // InternalCityDsl.g:2796:1: ( 'stations' )
            {
            // InternalCityDsl.g:2796:1: ( 'stations' )
            // InternalCityDsl.g:2797:2: 'stations'
            {
             before(grammarAccess.getLineAccess().getStationsKeyword_6_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getStationsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_6__0__Impl"


    // $ANTLR start "rule__Line__Group_6__1"
    // InternalCityDsl.g:2806:1: rule__Line__Group_6__1 : rule__Line__Group_6__1__Impl rule__Line__Group_6__2 ;
    public final void rule__Line__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2810:1: ( rule__Line__Group_6__1__Impl rule__Line__Group_6__2 )
            // InternalCityDsl.g:2811:2: rule__Line__Group_6__1__Impl rule__Line__Group_6__2
            {
            pushFollow(FOLLOW_20);
            rule__Line__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_6__1"


    // $ANTLR start "rule__Line__Group_6__1__Impl"
    // InternalCityDsl.g:2818:1: rule__Line__Group_6__1__Impl : ( '(' ) ;
    public final void rule__Line__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2822:1: ( ( '(' ) )
            // InternalCityDsl.g:2823:1: ( '(' )
            {
            // InternalCityDsl.g:2823:1: ( '(' )
            // InternalCityDsl.g:2824:2: '('
            {
             before(grammarAccess.getLineAccess().getLeftParenthesisKeyword_6_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getLeftParenthesisKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_6__1__Impl"


    // $ANTLR start "rule__Line__Group_6__2"
    // InternalCityDsl.g:2833:1: rule__Line__Group_6__2 : rule__Line__Group_6__2__Impl rule__Line__Group_6__3 ;
    public final void rule__Line__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2837:1: ( rule__Line__Group_6__2__Impl rule__Line__Group_6__3 )
            // InternalCityDsl.g:2838:2: rule__Line__Group_6__2__Impl rule__Line__Group_6__3
            {
            pushFollow(FOLLOW_27);
            rule__Line__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_6__2"


    // $ANTLR start "rule__Line__Group_6__2__Impl"
    // InternalCityDsl.g:2845:1: rule__Line__Group_6__2__Impl : ( ( rule__Line__StationsAssignment_6_2 ) ) ;
    public final void rule__Line__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2849:1: ( ( ( rule__Line__StationsAssignment_6_2 ) ) )
            // InternalCityDsl.g:2850:1: ( ( rule__Line__StationsAssignment_6_2 ) )
            {
            // InternalCityDsl.g:2850:1: ( ( rule__Line__StationsAssignment_6_2 ) )
            // InternalCityDsl.g:2851:2: ( rule__Line__StationsAssignment_6_2 )
            {
             before(grammarAccess.getLineAccess().getStationsAssignment_6_2()); 
            // InternalCityDsl.g:2852:2: ( rule__Line__StationsAssignment_6_2 )
            // InternalCityDsl.g:2852:3: rule__Line__StationsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Line__StationsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getStationsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_6__2__Impl"


    // $ANTLR start "rule__Line__Group_6__3"
    // InternalCityDsl.g:2860:1: rule__Line__Group_6__3 : rule__Line__Group_6__3__Impl rule__Line__Group_6__4 ;
    public final void rule__Line__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2864:1: ( rule__Line__Group_6__3__Impl rule__Line__Group_6__4 )
            // InternalCityDsl.g:2865:2: rule__Line__Group_6__3__Impl rule__Line__Group_6__4
            {
            pushFollow(FOLLOW_27);
            rule__Line__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_6__3"


    // $ANTLR start "rule__Line__Group_6__3__Impl"
    // InternalCityDsl.g:2872:1: rule__Line__Group_6__3__Impl : ( ( rule__Line__Group_6_3__0 )* ) ;
    public final void rule__Line__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2876:1: ( ( ( rule__Line__Group_6_3__0 )* ) )
            // InternalCityDsl.g:2877:1: ( ( rule__Line__Group_6_3__0 )* )
            {
            // InternalCityDsl.g:2877:1: ( ( rule__Line__Group_6_3__0 )* )
            // InternalCityDsl.g:2878:2: ( rule__Line__Group_6_3__0 )*
            {
             before(grammarAccess.getLineAccess().getGroup_6_3()); 
            // InternalCityDsl.g:2879:2: ( rule__Line__Group_6_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==33) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalCityDsl.g:2879:3: rule__Line__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Line__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getLineAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_6__3__Impl"


    // $ANTLR start "rule__Line__Group_6__4"
    // InternalCityDsl.g:2887:1: rule__Line__Group_6__4 : rule__Line__Group_6__4__Impl ;
    public final void rule__Line__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2891:1: ( rule__Line__Group_6__4__Impl )
            // InternalCityDsl.g:2892:2: rule__Line__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Line__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_6__4"


    // $ANTLR start "rule__Line__Group_6__4__Impl"
    // InternalCityDsl.g:2898:1: rule__Line__Group_6__4__Impl : ( ')' ) ;
    public final void rule__Line__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2902:1: ( ( ')' ) )
            // InternalCityDsl.g:2903:1: ( ')' )
            {
            // InternalCityDsl.g:2903:1: ( ')' )
            // InternalCityDsl.g:2904:2: ')'
            {
             before(grammarAccess.getLineAccess().getRightParenthesisKeyword_6_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getRightParenthesisKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_6__4__Impl"


    // $ANTLR start "rule__Line__Group_6_3__0"
    // InternalCityDsl.g:2914:1: rule__Line__Group_6_3__0 : rule__Line__Group_6_3__0__Impl rule__Line__Group_6_3__1 ;
    public final void rule__Line__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2918:1: ( rule__Line__Group_6_3__0__Impl rule__Line__Group_6_3__1 )
            // InternalCityDsl.g:2919:2: rule__Line__Group_6_3__0__Impl rule__Line__Group_6_3__1
            {
            pushFollow(FOLLOW_20);
            rule__Line__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_6_3__0"


    // $ANTLR start "rule__Line__Group_6_3__0__Impl"
    // InternalCityDsl.g:2926:1: rule__Line__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Line__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2930:1: ( ( ',' ) )
            // InternalCityDsl.g:2931:1: ( ',' )
            {
            // InternalCityDsl.g:2931:1: ( ',' )
            // InternalCityDsl.g:2932:2: ','
            {
             before(grammarAccess.getLineAccess().getCommaKeyword_6_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_6_3__0__Impl"


    // $ANTLR start "rule__Line__Group_6_3__1"
    // InternalCityDsl.g:2941:1: rule__Line__Group_6_3__1 : rule__Line__Group_6_3__1__Impl ;
    public final void rule__Line__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2945:1: ( rule__Line__Group_6_3__1__Impl )
            // InternalCityDsl.g:2946:2: rule__Line__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Line__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_6_3__1"


    // $ANTLR start "rule__Line__Group_6_3__1__Impl"
    // InternalCityDsl.g:2952:1: rule__Line__Group_6_3__1__Impl : ( ( rule__Line__StationsAssignment_6_3_1 ) ) ;
    public final void rule__Line__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2956:1: ( ( ( rule__Line__StationsAssignment_6_3_1 ) ) )
            // InternalCityDsl.g:2957:1: ( ( rule__Line__StationsAssignment_6_3_1 ) )
            {
            // InternalCityDsl.g:2957:1: ( ( rule__Line__StationsAssignment_6_3_1 ) )
            // InternalCityDsl.g:2958:2: ( rule__Line__StationsAssignment_6_3_1 )
            {
             before(grammarAccess.getLineAccess().getStationsAssignment_6_3_1()); 
            // InternalCityDsl.g:2959:2: ( rule__Line__StationsAssignment_6_3_1 )
            // InternalCityDsl.g:2959:3: rule__Line__StationsAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Line__StationsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getStationsAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_6_3__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalCityDsl.g:2968:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2972:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalCityDsl.g:2973:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalCityDsl.g:2980:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2984:1: ( ( ( '-' )? ) )
            // InternalCityDsl.g:2985:1: ( ( '-' )? )
            {
            // InternalCityDsl.g:2985:1: ( ( '-' )? )
            // InternalCityDsl.g:2986:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalCityDsl.g:2987:2: ( '-' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==29) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCityDsl.g:2987:3: '-'
                    {
                    match(input,29,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalCityDsl.g:2995:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:2999:1: ( rule__EInt__Group__1__Impl )
            // InternalCityDsl.g:3000:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalCityDsl.g:3006:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:3010:1: ( ( RULE_INT ) )
            // InternalCityDsl.g:3011:1: ( RULE_INT )
            {
            // InternalCityDsl.g:3011:1: ( RULE_INT )
            // InternalCityDsl.g:3012:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__City__NameAssignment_2"
    // InternalCityDsl.g:3022:1: rule__City__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__City__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:3026:1: ( ( ruleEString ) )
            // InternalCityDsl.g:3027:2: ( ruleEString )
            {
            // InternalCityDsl.g:3027:2: ( ruleEString )
            // InternalCityDsl.g:3028:3: ruleEString
            {
             before(grammarAccess.getCityAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCityAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__NameAssignment_2"


    // $ANTLR start "rule__City__LongitudeAssignment_4_2_1"
    // InternalCityDsl.g:3037:1: rule__City__LongitudeAssignment_4_2_1 : ( ruleEDouble ) ;
    public final void rule__City__LongitudeAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:3041:1: ( ( ruleEDouble ) )
            // InternalCityDsl.g:3042:2: ( ruleEDouble )
            {
            // InternalCityDsl.g:3042:2: ( ruleEDouble )
            // InternalCityDsl.g:3043:3: ruleEDouble
            {
             before(grammarAccess.getCityAccess().getLongitudeEDoubleParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getCityAccess().getLongitudeEDoubleParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__LongitudeAssignment_4_2_1"


    // $ANTLR start "rule__City__LatitudeAssignment_4_3_1"
    // InternalCityDsl.g:3052:1: rule__City__LatitudeAssignment_4_3_1 : ( ruleEDouble ) ;
    public final void rule__City__LatitudeAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:3056:1: ( ( ruleEDouble ) )
            // InternalCityDsl.g:3057:2: ( ruleEDouble )
            {
            // InternalCityDsl.g:3057:2: ( ruleEDouble )
            // InternalCityDsl.g:3058:3: ruleEDouble
            {
             before(grammarAccess.getCityAccess().getLatitudeEDoubleParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getCityAccess().getLatitudeEDoubleParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__LatitudeAssignment_4_3_1"


    // $ANTLR start "rule__City__AltitudeAssignment_4_4_1"
    // InternalCityDsl.g:3067:1: rule__City__AltitudeAssignment_4_4_1 : ( ruleEFloat ) ;
    public final void rule__City__AltitudeAssignment_4_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:3071:1: ( ( ruleEFloat ) )
            // InternalCityDsl.g:3072:2: ( ruleEFloat )
            {
            // InternalCityDsl.g:3072:2: ( ruleEFloat )
            // InternalCityDsl.g:3073:3: ruleEFloat
            {
             before(grammarAccess.getCityAccess().getAltitudeEFloatParserRuleCall_4_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getCityAccess().getAltitudeEFloatParserRuleCall_4_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__AltitudeAssignment_4_4_1"


    // $ANTLR start "rule__City__CountryAssignment_5_1"
    // InternalCityDsl.g:3082:1: rule__City__CountryAssignment_5_1 : ( ruleEString ) ;
    public final void rule__City__CountryAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:3086:1: ( ( ruleEString ) )
            // InternalCityDsl.g:3087:2: ( ruleEString )
            {
            // InternalCityDsl.g:3087:2: ( ruleEString )
            // InternalCityDsl.g:3088:3: ruleEString
            {
             before(grammarAccess.getCityAccess().getCountryEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCityAccess().getCountryEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__CountryAssignment_5_1"


    // $ANTLR start "rule__City__StationsAssignment_6_0"
    // InternalCityDsl.g:3097:1: rule__City__StationsAssignment_6_0 : ( ruleStation ) ;
    public final void rule__City__StationsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:3101:1: ( ( ruleStation ) )
            // InternalCityDsl.g:3102:2: ( ruleStation )
            {
            // InternalCityDsl.g:3102:2: ( ruleStation )
            // InternalCityDsl.g:3103:3: ruleStation
            {
             before(grammarAccess.getCityAccess().getStationsStationParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStation();

            state._fsp--;

             after(grammarAccess.getCityAccess().getStationsStationParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__StationsAssignment_6_0"


    // $ANTLR start "rule__City__StationsAssignment_6_1"
    // InternalCityDsl.g:3112:1: rule__City__StationsAssignment_6_1 : ( ruleStation ) ;
    public final void rule__City__StationsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:3116:1: ( ( ruleStation ) )
            // InternalCityDsl.g:3117:2: ( ruleStation )
            {
            // InternalCityDsl.g:3117:2: ( ruleStation )
            // InternalCityDsl.g:3118:3: ruleStation
            {
             before(grammarAccess.getCityAccess().getStationsStationParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStation();

            state._fsp--;

             after(grammarAccess.getCityAccess().getStationsStationParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__StationsAssignment_6_1"


    // $ANTLR start "rule__City__LinesAssignment_7_0"
    // InternalCityDsl.g:3127:1: rule__City__LinesAssignment_7_0 : ( ruleLine ) ;
    public final void rule__City__LinesAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:3131:1: ( ( ruleLine ) )
            // InternalCityDsl.g:3132:2: ( ruleLine )
            {
            // InternalCityDsl.g:3132:2: ( ruleLine )
            // InternalCityDsl.g:3133:3: ruleLine
            {
             before(grammarAccess.getCityAccess().getLinesLineParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getCityAccess().getLinesLineParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__LinesAssignment_7_0"


    // $ANTLR start "rule__City__LinesAssignment_7_1"
    // InternalCityDsl.g:3142:1: rule__City__LinesAssignment_7_1 : ( ruleLine ) ;
    public final void rule__City__LinesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:3146:1: ( ( ruleLine ) )
            // InternalCityDsl.g:3147:2: ( ruleLine )
            {
            // InternalCityDsl.g:3147:2: ( ruleLine )
            // InternalCityDsl.g:3148:3: ruleLine
            {
             before(grammarAccess.getCityAccess().getLinesLineParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getCityAccess().getLinesLineParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__City__LinesAssignment_7_1"


    // $ANTLR start "rule__Station__NameAssignment_1"
    // InternalCityDsl.g:3157:1: rule__Station__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Station__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:3161:1: ( ( RULE_ID ) )
            // InternalCityDsl.g:3162:2: ( RULE_ID )
            {
            // InternalCityDsl.g:3162:2: ( RULE_ID )
            // InternalCityDsl.g:3163:3: RULE_ID
            {
             before(grammarAccess.getStationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__NameAssignment_1"


    // $ANTLR start "rule__Station__LongitudeAssignment_3_2_1"
    // InternalCityDsl.g:3172:1: rule__Station__LongitudeAssignment_3_2_1 : ( ruleEDouble ) ;
    public final void rule__Station__LongitudeAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:3176:1: ( ( ruleEDouble ) )
            // InternalCityDsl.g:3177:2: ( ruleEDouble )
            {
            // InternalCityDsl.g:3177:2: ( ruleEDouble )
            // InternalCityDsl.g:3178:3: ruleEDouble
            {
             before(grammarAccess.getStationAccess().getLongitudeEDoubleParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getStationAccess().getLongitudeEDoubleParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__LongitudeAssignment_3_2_1"


    // $ANTLR start "rule__Station__LatitudeAssignment_3_3_1"
    // InternalCityDsl.g:3187:1: rule__Station__LatitudeAssignment_3_3_1 : ( ruleEDouble ) ;
    public final void rule__Station__LatitudeAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:3191:1: ( ( ruleEDouble ) )
            // InternalCityDsl.g:3192:2: ( ruleEDouble )
            {
            // InternalCityDsl.g:3192:2: ( ruleEDouble )
            // InternalCityDsl.g:3193:3: ruleEDouble
            {
             before(grammarAccess.getStationAccess().getLatitudeEDoubleParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getStationAccess().getLatitudeEDoubleParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__LatitudeAssignment_3_3_1"


    // $ANTLR start "rule__Station__AltitudeAssignment_3_4_1"
    // InternalCityDsl.g:3202:1: rule__Station__AltitudeAssignment_3_4_1 : ( ruleEFloat ) ;
    public final void rule__Station__AltitudeAssignment_3_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:3206:1: ( ( ruleEFloat ) )
            // InternalCityDsl.g:3207:2: ( ruleEFloat )
            {
            // InternalCityDsl.g:3207:2: ( ruleEFloat )
            // InternalCityDsl.g:3208:3: ruleEFloat
            {
             before(grammarAccess.getStationAccess().getAltitudeEFloatParserRuleCall_3_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getStationAccess().getAltitudeEFloatParserRuleCall_3_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__AltitudeAssignment_3_4_1"


    // $ANTLR start "rule__Station__OfficeAssignment_4"
    // InternalCityDsl.g:3217:1: rule__Station__OfficeAssignment_4 : ( ( 'hasOffice' ) ) ;
    public final void rule__Station__OfficeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:3221:1: ( ( ( 'hasOffice' ) ) )
            // InternalCityDsl.g:3222:2: ( ( 'hasOffice' ) )
            {
            // InternalCityDsl.g:3222:2: ( ( 'hasOffice' ) )
            // InternalCityDsl.g:3223:3: ( 'hasOffice' )
            {
             before(grammarAccess.getStationAccess().getOfficeHasOfficeKeyword_4_0()); 
            // InternalCityDsl.g:3224:3: ( 'hasOffice' )
            // InternalCityDsl.g:3225:4: 'hasOffice'
            {
             before(grammarAccess.getStationAccess().getOfficeHasOfficeKeyword_4_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getStationAccess().getOfficeHasOfficeKeyword_4_0()); 

            }

             after(grammarAccess.getStationAccess().getOfficeHasOfficeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__OfficeAssignment_4"


    // $ANTLR start "rule__Station__OpenedAssignment_5"
    // InternalCityDsl.g:3236:1: rule__Station__OpenedAssignment_5 : ( ( 'isOpened' ) ) ;
    public final void rule__Station__OpenedAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:3240:1: ( ( ( 'isOpened' ) ) )
            // InternalCityDsl.g:3241:2: ( ( 'isOpened' ) )
            {
            // InternalCityDsl.g:3241:2: ( ( 'isOpened' ) )
            // InternalCityDsl.g:3242:3: ( 'isOpened' )
            {
             before(grammarAccess.getStationAccess().getOpenedIsOpenedKeyword_5_0()); 
            // InternalCityDsl.g:3243:3: ( 'isOpened' )
            // InternalCityDsl.g:3244:4: 'isOpened'
            {
             before(grammarAccess.getStationAccess().getOpenedIsOpenedKeyword_5_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getStationAccess().getOpenedIsOpenedKeyword_5_0()); 

            }

             after(grammarAccess.getStationAccess().getOpenedIsOpenedKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__OpenedAssignment_5"


    // $ANTLR start "rule__Station__DisabledAccessAssignment_6"
    // InternalCityDsl.g:3255:1: rule__Station__DisabledAccessAssignment_6 : ( ( 'hasDisabledAccess' ) ) ;
    public final void rule__Station__DisabledAccessAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:3259:1: ( ( ( 'hasDisabledAccess' ) ) )
            // InternalCityDsl.g:3260:2: ( ( 'hasDisabledAccess' ) )
            {
            // InternalCityDsl.g:3260:2: ( ( 'hasDisabledAccess' ) )
            // InternalCityDsl.g:3261:3: ( 'hasDisabledAccess' )
            {
             before(grammarAccess.getStationAccess().getDisabledAccessHasDisabledAccessKeyword_6_0()); 
            // InternalCityDsl.g:3262:3: ( 'hasDisabledAccess' )
            // InternalCityDsl.g:3263:4: 'hasDisabledAccess'
            {
             before(grammarAccess.getStationAccess().getDisabledAccessHasDisabledAccessKeyword_6_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getStationAccess().getDisabledAccessHasDisabledAccessKeyword_6_0()); 

            }

             after(grammarAccess.getStationAccess().getDisabledAccessHasDisabledAccessKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__DisabledAccessAssignment_6"


    // $ANTLR start "rule__Station__TypeAssignment_8"
    // InternalCityDsl.g:3274:1: rule__Station__TypeAssignment_8 : ( ruleTransportType ) ;
    public final void rule__Station__TypeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:3278:1: ( ( ruleTransportType ) )
            // InternalCityDsl.g:3279:2: ( ruleTransportType )
            {
            // InternalCityDsl.g:3279:2: ( ruleTransportType )
            // InternalCityDsl.g:3280:3: ruleTransportType
            {
             before(grammarAccess.getStationAccess().getTypeTransportTypeEnumRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleTransportType();

            state._fsp--;

             after(grammarAccess.getStationAccess().getTypeTransportTypeEnumRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__TypeAssignment_8"


    // $ANTLR start "rule__Station__TypeAssignment_9_1"
    // InternalCityDsl.g:3289:1: rule__Station__TypeAssignment_9_1 : ( ruleTransportType ) ;
    public final void rule__Station__TypeAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:3293:1: ( ( ruleTransportType ) )
            // InternalCityDsl.g:3294:2: ( ruleTransportType )
            {
            // InternalCityDsl.g:3294:2: ( ruleTransportType )
            // InternalCityDsl.g:3295:3: ruleTransportType
            {
             before(grammarAccess.getStationAccess().getTypeTransportTypeEnumRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransportType();

            state._fsp--;

             after(grammarAccess.getStationAccess().getTypeTransportTypeEnumRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__TypeAssignment_9_1"


    // $ANTLR start "rule__Station__NbOfTicketMachinesAssignment_10_1"
    // InternalCityDsl.g:3304:1: rule__Station__NbOfTicketMachinesAssignment_10_1 : ( ruleEInt ) ;
    public final void rule__Station__NbOfTicketMachinesAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:3308:1: ( ( ruleEInt ) )
            // InternalCityDsl.g:3309:2: ( ruleEInt )
            {
            // InternalCityDsl.g:3309:2: ( ruleEInt )
            // InternalCityDsl.g:3310:3: ruleEInt
            {
             before(grammarAccess.getStationAccess().getNbOfTicketMachinesEIntParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getStationAccess().getNbOfTicketMachinesEIntParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__NbOfTicketMachinesAssignment_10_1"


    // $ANTLR start "rule__Station__NbOfElevatorsAssignment_11_1"
    // InternalCityDsl.g:3319:1: rule__Station__NbOfElevatorsAssignment_11_1 : ( ruleEInt ) ;
    public final void rule__Station__NbOfElevatorsAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:3323:1: ( ( ruleEInt ) )
            // InternalCityDsl.g:3324:2: ( ruleEInt )
            {
            // InternalCityDsl.g:3324:2: ( ruleEInt )
            // InternalCityDsl.g:3325:3: ruleEInt
            {
             before(grammarAccess.getStationAccess().getNbOfElevatorsEIntParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getStationAccess().getNbOfElevatorsEIntParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__NbOfElevatorsAssignment_11_1"


    // $ANTLR start "rule__Station__ZoneAssignment_12_1"
    // InternalCityDsl.g:3334:1: rule__Station__ZoneAssignment_12_1 : ( ruleEInt ) ;
    public final void rule__Station__ZoneAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:3338:1: ( ( ruleEInt ) )
            // InternalCityDsl.g:3339:2: ( ruleEInt )
            {
            // InternalCityDsl.g:3339:2: ( ruleEInt )
            // InternalCityDsl.g:3340:3: ruleEInt
            {
             before(grammarAccess.getStationAccess().getZoneEIntParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getStationAccess().getZoneEIntParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Station__ZoneAssignment_12_1"


    // $ANTLR start "rule__Line__NameAssignment_2"
    // InternalCityDsl.g:3349:1: rule__Line__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Line__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:3353:1: ( ( RULE_ID ) )
            // InternalCityDsl.g:3354:2: ( RULE_ID )
            {
            // InternalCityDsl.g:3354:2: ( RULE_ID )
            // InternalCityDsl.g:3355:3: RULE_ID
            {
             before(grammarAccess.getLineAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__NameAssignment_2"


    // $ANTLR start "rule__Line__TypeAssignment_4_1"
    // InternalCityDsl.g:3364:1: rule__Line__TypeAssignment_4_1 : ( ruleTransportType ) ;
    public final void rule__Line__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:3368:1: ( ( ruleTransportType ) )
            // InternalCityDsl.g:3369:2: ( ruleTransportType )
            {
            // InternalCityDsl.g:3369:2: ( ruleTransportType )
            // InternalCityDsl.g:3370:3: ruleTransportType
            {
             before(grammarAccess.getLineAccess().getTypeTransportTypeEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransportType();

            state._fsp--;

             after(grammarAccess.getLineAccess().getTypeTransportTypeEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__TypeAssignment_4_1"


    // $ANTLR start "rule__Line__TopologyAssignment_5_1"
    // InternalCityDsl.g:3379:1: rule__Line__TopologyAssignment_5_1 : ( ruleTopology ) ;
    public final void rule__Line__TopologyAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:3383:1: ( ( ruleTopology ) )
            // InternalCityDsl.g:3384:2: ( ruleTopology )
            {
            // InternalCityDsl.g:3384:2: ( ruleTopology )
            // InternalCityDsl.g:3385:3: ruleTopology
            {
             before(grammarAccess.getLineAccess().getTopologyTopologyEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTopology();

            state._fsp--;

             after(grammarAccess.getLineAccess().getTopologyTopologyEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__TopologyAssignment_5_1"


    // $ANTLR start "rule__Line__StationsAssignment_6_2"
    // InternalCityDsl.g:3394:1: rule__Line__StationsAssignment_6_2 : ( ( RULE_ID ) ) ;
    public final void rule__Line__StationsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:3398:1: ( ( ( RULE_ID ) ) )
            // InternalCityDsl.g:3399:2: ( ( RULE_ID ) )
            {
            // InternalCityDsl.g:3399:2: ( ( RULE_ID ) )
            // InternalCityDsl.g:3400:3: ( RULE_ID )
            {
             before(grammarAccess.getLineAccess().getStationsStationCrossReference_6_2_0()); 
            // InternalCityDsl.g:3401:3: ( RULE_ID )
            // InternalCityDsl.g:3402:4: RULE_ID
            {
             before(grammarAccess.getLineAccess().getStationsStationIDTerminalRuleCall_6_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getStationsStationIDTerminalRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getLineAccess().getStationsStationCrossReference_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__StationsAssignment_6_2"


    // $ANTLR start "rule__Line__StationsAssignment_6_3_1"
    // InternalCityDsl.g:3413:1: rule__Line__StationsAssignment_6_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Line__StationsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCityDsl.g:3417:1: ( ( ( RULE_ID ) ) )
            // InternalCityDsl.g:3418:2: ( ( RULE_ID ) )
            {
            // InternalCityDsl.g:3418:2: ( ( RULE_ID ) )
            // InternalCityDsl.g:3419:3: ( RULE_ID )
            {
             before(grammarAccess.getLineAccess().getStationsStationCrossReference_6_3_1_0()); 
            // InternalCityDsl.g:3420:3: ( RULE_ID )
            // InternalCityDsl.g:3421:4: RULE_ID
            {
             before(grammarAccess.getLineAccess().getStationsStationIDTerminalRuleCall_6_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getStationsStationIDTerminalRuleCall_6_3_1_0_1()); 

            }

             after(grammarAccess.getLineAccess().getStationsStationCrossReference_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__StationsAssignment_6_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000002090600000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000060000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000E0100400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001E00200000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000001C000200000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000201000000L});

}