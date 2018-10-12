package com.city.network.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.city.network.xtext.services.CityDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCityDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'City'", "'{'", "'location'", "'('", "'longitude'", "'latitude'", "'altitude'", "')'", "'country'", "'}'", "'-'", "'.'", "'E'", "'e'", "'Station'", "'hasOffice'", "'isOpened'", "'hasDisabledAccess'", "'type'", "','", "'nbOfTicketMachines'", "'nbOfElevators'", "'zone'", "'Line'", "'of'", "'topology'", "'stations'", "'BUS'", "'METRO'", "'TRAIN'", "'TRAMWAY'", "'LINEAR'", "'CIRCULAR'"
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
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
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

        public InternalCityDslParser(TokenStream input, CityDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "City";
       	}

       	@Override
       	protected CityDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCity"
    // InternalCityDsl.g:65:1: entryRuleCity returns [EObject current=null] : iv_ruleCity= ruleCity EOF ;
    public final EObject entryRuleCity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCity = null;


        try {
            // InternalCityDsl.g:65:45: (iv_ruleCity= ruleCity EOF )
            // InternalCityDsl.g:66:2: iv_ruleCity= ruleCity EOF
            {
             newCompositeNode(grammarAccess.getCityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCity=ruleCity();

            state._fsp--;

             current =iv_ruleCity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCity"


    // $ANTLR start "ruleCity"
    // InternalCityDsl.g:72:1: ruleCity returns [EObject current=null] : ( () otherlv_1= 'City' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'location' otherlv_5= '(' (otherlv_6= 'longitude' ( (lv_longitude_7_0= ruleEDouble ) ) ) (otherlv_8= 'latitude' ( (lv_latitude_9_0= ruleEDouble ) ) ) (otherlv_10= 'altitude' ( (lv_altitude_11_0= ruleEFloat ) ) ) otherlv_12= ')' )? (otherlv_13= 'country' ( (lv_country_14_0= ruleEString ) ) )? ( ( (lv_stations_15_0= ruleStation ) ) ( (lv_stations_16_0= ruleStation ) )* )? ( ( (lv_lines_17_0= ruleLine ) ) ( (lv_lines_18_0= ruleLine ) )* )? otherlv_19= '}' ) ;
    public final EObject ruleCity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_longitude_7_0 = null;

        AntlrDatatypeRuleToken lv_latitude_9_0 = null;

        AntlrDatatypeRuleToken lv_altitude_11_0 = null;

        AntlrDatatypeRuleToken lv_country_14_0 = null;

        EObject lv_stations_15_0 = null;

        EObject lv_stations_16_0 = null;

        EObject lv_lines_17_0 = null;

        EObject lv_lines_18_0 = null;



        	enterRule();

        try {
            // InternalCityDsl.g:78:2: ( ( () otherlv_1= 'City' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'location' otherlv_5= '(' (otherlv_6= 'longitude' ( (lv_longitude_7_0= ruleEDouble ) ) ) (otherlv_8= 'latitude' ( (lv_latitude_9_0= ruleEDouble ) ) ) (otherlv_10= 'altitude' ( (lv_altitude_11_0= ruleEFloat ) ) ) otherlv_12= ')' )? (otherlv_13= 'country' ( (lv_country_14_0= ruleEString ) ) )? ( ( (lv_stations_15_0= ruleStation ) ) ( (lv_stations_16_0= ruleStation ) )* )? ( ( (lv_lines_17_0= ruleLine ) ) ( (lv_lines_18_0= ruleLine ) )* )? otherlv_19= '}' ) )
            // InternalCityDsl.g:79:2: ( () otherlv_1= 'City' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'location' otherlv_5= '(' (otherlv_6= 'longitude' ( (lv_longitude_7_0= ruleEDouble ) ) ) (otherlv_8= 'latitude' ( (lv_latitude_9_0= ruleEDouble ) ) ) (otherlv_10= 'altitude' ( (lv_altitude_11_0= ruleEFloat ) ) ) otherlv_12= ')' )? (otherlv_13= 'country' ( (lv_country_14_0= ruleEString ) ) )? ( ( (lv_stations_15_0= ruleStation ) ) ( (lv_stations_16_0= ruleStation ) )* )? ( ( (lv_lines_17_0= ruleLine ) ) ( (lv_lines_18_0= ruleLine ) )* )? otherlv_19= '}' )
            {
            // InternalCityDsl.g:79:2: ( () otherlv_1= 'City' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'location' otherlv_5= '(' (otherlv_6= 'longitude' ( (lv_longitude_7_0= ruleEDouble ) ) ) (otherlv_8= 'latitude' ( (lv_latitude_9_0= ruleEDouble ) ) ) (otherlv_10= 'altitude' ( (lv_altitude_11_0= ruleEFloat ) ) ) otherlv_12= ')' )? (otherlv_13= 'country' ( (lv_country_14_0= ruleEString ) ) )? ( ( (lv_stations_15_0= ruleStation ) ) ( (lv_stations_16_0= ruleStation ) )* )? ( ( (lv_lines_17_0= ruleLine ) ) ( (lv_lines_18_0= ruleLine ) )* )? otherlv_19= '}' )
            // InternalCityDsl.g:80:3: () otherlv_1= 'City' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'location' otherlv_5= '(' (otherlv_6= 'longitude' ( (lv_longitude_7_0= ruleEDouble ) ) ) (otherlv_8= 'latitude' ( (lv_latitude_9_0= ruleEDouble ) ) ) (otherlv_10= 'altitude' ( (lv_altitude_11_0= ruleEFloat ) ) ) otherlv_12= ')' )? (otherlv_13= 'country' ( (lv_country_14_0= ruleEString ) ) )? ( ( (lv_stations_15_0= ruleStation ) ) ( (lv_stations_16_0= ruleStation ) )* )? ( ( (lv_lines_17_0= ruleLine ) ) ( (lv_lines_18_0= ruleLine ) )* )? otherlv_19= '}'
            {
            // InternalCityDsl.g:80:3: ()
            // InternalCityDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCityAccess().getCityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCityAccess().getCityKeyword_1());
            		
            // InternalCityDsl.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCityDsl.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalCityDsl.g:92:4: (lv_name_2_0= ruleEString )
            // InternalCityDsl.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCityAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCityRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.city.network.xtext.CityDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getCityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCityDsl.g:114:3: (otherlv_4= 'location' otherlv_5= '(' (otherlv_6= 'longitude' ( (lv_longitude_7_0= ruleEDouble ) ) ) (otherlv_8= 'latitude' ( (lv_latitude_9_0= ruleEDouble ) ) ) (otherlv_10= 'altitude' ( (lv_altitude_11_0= ruleEFloat ) ) ) otherlv_12= ')' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCityDsl.g:115:4: otherlv_4= 'location' otherlv_5= '(' (otherlv_6= 'longitude' ( (lv_longitude_7_0= ruleEDouble ) ) ) (otherlv_8= 'latitude' ( (lv_latitude_9_0= ruleEDouble ) ) ) (otherlv_10= 'altitude' ( (lv_altitude_11_0= ruleEFloat ) ) ) otherlv_12= ')'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getCityAccess().getLocationKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getCityAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalCityDsl.g:123:4: (otherlv_6= 'longitude' ( (lv_longitude_7_0= ruleEDouble ) ) )
                    // InternalCityDsl.g:124:5: otherlv_6= 'longitude' ( (lv_longitude_7_0= ruleEDouble ) )
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_8); 

                    					newLeafNode(otherlv_6, grammarAccess.getCityAccess().getLongitudeKeyword_4_2_0());
                    				
                    // InternalCityDsl.g:128:5: ( (lv_longitude_7_0= ruleEDouble ) )
                    // InternalCityDsl.g:129:6: (lv_longitude_7_0= ruleEDouble )
                    {
                    // InternalCityDsl.g:129:6: (lv_longitude_7_0= ruleEDouble )
                    // InternalCityDsl.g:130:7: lv_longitude_7_0= ruleEDouble
                    {

                    							newCompositeNode(grammarAccess.getCityAccess().getLongitudeEDoubleParserRuleCall_4_2_1_0());
                    						
                    pushFollow(FOLLOW_9);
                    lv_longitude_7_0=ruleEDouble();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCityRule());
                    							}
                    							set(
                    								current,
                    								"longitude",
                    								lv_longitude_7_0,
                    								"com.city.network.xtext.CityDsl.EDouble");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    // InternalCityDsl.g:148:4: (otherlv_8= 'latitude' ( (lv_latitude_9_0= ruleEDouble ) ) )
                    // InternalCityDsl.g:149:5: otherlv_8= 'latitude' ( (lv_latitude_9_0= ruleEDouble ) )
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_8); 

                    					newLeafNode(otherlv_8, grammarAccess.getCityAccess().getLatitudeKeyword_4_3_0());
                    				
                    // InternalCityDsl.g:153:5: ( (lv_latitude_9_0= ruleEDouble ) )
                    // InternalCityDsl.g:154:6: (lv_latitude_9_0= ruleEDouble )
                    {
                    // InternalCityDsl.g:154:6: (lv_latitude_9_0= ruleEDouble )
                    // InternalCityDsl.g:155:7: lv_latitude_9_0= ruleEDouble
                    {

                    							newCompositeNode(grammarAccess.getCityAccess().getLatitudeEDoubleParserRuleCall_4_3_1_0());
                    						
                    pushFollow(FOLLOW_10);
                    lv_latitude_9_0=ruleEDouble();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCityRule());
                    							}
                    							set(
                    								current,
                    								"latitude",
                    								lv_latitude_9_0,
                    								"com.city.network.xtext.CityDsl.EDouble");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    // InternalCityDsl.g:173:4: (otherlv_10= 'altitude' ( (lv_altitude_11_0= ruleEFloat ) ) )
                    // InternalCityDsl.g:174:5: otherlv_10= 'altitude' ( (lv_altitude_11_0= ruleEFloat ) )
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_8); 

                    					newLeafNode(otherlv_10, grammarAccess.getCityAccess().getAltitudeKeyword_4_4_0());
                    				
                    // InternalCityDsl.g:178:5: ( (lv_altitude_11_0= ruleEFloat ) )
                    // InternalCityDsl.g:179:6: (lv_altitude_11_0= ruleEFloat )
                    {
                    // InternalCityDsl.g:179:6: (lv_altitude_11_0= ruleEFloat )
                    // InternalCityDsl.g:180:7: lv_altitude_11_0= ruleEFloat
                    {

                    							newCompositeNode(grammarAccess.getCityAccess().getAltitudeEFloatParserRuleCall_4_4_1_0());
                    						
                    pushFollow(FOLLOW_11);
                    lv_altitude_11_0=ruleEFloat();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCityRule());
                    							}
                    							set(
                    								current,
                    								"altitude",
                    								lv_altitude_11_0,
                    								"com.city.network.xtext.CityDsl.EFloat");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    otherlv_12=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getCityAccess().getRightParenthesisKeyword_4_5());
                    			

                    }
                    break;

            }

            // InternalCityDsl.g:203:3: (otherlv_13= 'country' ( (lv_country_14_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCityDsl.g:204:4: otherlv_13= 'country' ( (lv_country_14_0= ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getCityAccess().getCountryKeyword_5_0());
                    			
                    // InternalCityDsl.g:208:4: ( (lv_country_14_0= ruleEString ) )
                    // InternalCityDsl.g:209:5: (lv_country_14_0= ruleEString )
                    {
                    // InternalCityDsl.g:209:5: (lv_country_14_0= ruleEString )
                    // InternalCityDsl.g:210:6: lv_country_14_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCityAccess().getCountryEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_country_14_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCityRule());
                    						}
                    						set(
                    							current,
                    							"country",
                    							lv_country_14_0,
                    							"com.city.network.xtext.CityDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCityDsl.g:228:3: ( ( (lv_stations_15_0= ruleStation ) ) ( (lv_stations_16_0= ruleStation ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCityDsl.g:229:4: ( (lv_stations_15_0= ruleStation ) ) ( (lv_stations_16_0= ruleStation ) )*
                    {
                    // InternalCityDsl.g:229:4: ( (lv_stations_15_0= ruleStation ) )
                    // InternalCityDsl.g:230:5: (lv_stations_15_0= ruleStation )
                    {
                    // InternalCityDsl.g:230:5: (lv_stations_15_0= ruleStation )
                    // InternalCityDsl.g:231:6: lv_stations_15_0= ruleStation
                    {

                    						newCompositeNode(grammarAccess.getCityAccess().getStationsStationParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_stations_15_0=ruleStation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCityRule());
                    						}
                    						add(
                    							current,
                    							"stations",
                    							lv_stations_15_0,
                    							"com.city.network.xtext.CityDsl.Station");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCityDsl.g:248:4: ( (lv_stations_16_0= ruleStation ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==25) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalCityDsl.g:249:5: (lv_stations_16_0= ruleStation )
                    	    {
                    	    // InternalCityDsl.g:249:5: (lv_stations_16_0= ruleStation )
                    	    // InternalCityDsl.g:250:6: lv_stations_16_0= ruleStation
                    	    {

                    	    						newCompositeNode(grammarAccess.getCityAccess().getStationsStationParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_stations_16_0=ruleStation();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCityRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"stations",
                    	    							lv_stations_16_0,
                    	    							"com.city.network.xtext.CityDsl.Station");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalCityDsl.g:268:3: ( ( (lv_lines_17_0= ruleLine ) ) ( (lv_lines_18_0= ruleLine ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==34) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCityDsl.g:269:4: ( (lv_lines_17_0= ruleLine ) ) ( (lv_lines_18_0= ruleLine ) )*
                    {
                    // InternalCityDsl.g:269:4: ( (lv_lines_17_0= ruleLine ) )
                    // InternalCityDsl.g:270:5: (lv_lines_17_0= ruleLine )
                    {
                    // InternalCityDsl.g:270:5: (lv_lines_17_0= ruleLine )
                    // InternalCityDsl.g:271:6: lv_lines_17_0= ruleLine
                    {

                    						newCompositeNode(grammarAccess.getCityAccess().getLinesLineParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_lines_17_0=ruleLine();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCityRule());
                    						}
                    						add(
                    							current,
                    							"lines",
                    							lv_lines_17_0,
                    							"com.city.network.xtext.CityDsl.Line");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCityDsl.g:288:4: ( (lv_lines_18_0= ruleLine ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==34) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCityDsl.g:289:5: (lv_lines_18_0= ruleLine )
                    	    {
                    	    // InternalCityDsl.g:289:5: (lv_lines_18_0= ruleLine )
                    	    // InternalCityDsl.g:290:6: lv_lines_18_0= ruleLine
                    	    {

                    	    						newCompositeNode(grammarAccess.getCityAccess().getLinesLineParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_lines_18_0=ruleLine();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCityRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"lines",
                    	    							lv_lines_18_0,
                    	    							"com.city.network.xtext.CityDsl.Line");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_19=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getCityAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCity"


    // $ANTLR start "entryRuleEDouble"
    // InternalCityDsl.g:316:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalCityDsl.g:316:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalCityDsl.g:317:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalCityDsl.g:323:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalCityDsl.g:329:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalCityDsl.g:330:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalCityDsl.g:330:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalCityDsl.g:331:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalCityDsl.g:331:3: (kw= '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCityDsl.g:332:4: kw= '-'
                    {
                    kw=(Token)match(input,21,FOLLOW_15); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalCityDsl.g:338:3: (this_INT_1= RULE_INT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCityDsl.g:339:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_16); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,22,FOLLOW_17); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_18); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalCityDsl.g:359:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=23 && LA11_0<=24)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCityDsl.g:360:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalCityDsl.g:360:4: (kw= 'E' | kw= 'e' )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==23) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==24) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalCityDsl.g:361:5: kw= 'E'
                            {
                            kw=(Token)match(input,23,FOLLOW_19); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalCityDsl.g:367:5: kw= 'e'
                            {
                            kw=(Token)match(input,24,FOLLOW_19); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalCityDsl.g:373:4: (kw= '-' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==21) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalCityDsl.g:374:5: kw= '-'
                            {
                            kw=(Token)match(input,21,FOLLOW_17); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEFloat"
    // InternalCityDsl.g:392:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalCityDsl.g:392:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalCityDsl.g:393:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalCityDsl.g:399:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalCityDsl.g:405:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalCityDsl.g:406:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalCityDsl.g:406:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalCityDsl.g:407:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalCityDsl.g:407:3: (kw= '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCityDsl.g:408:4: kw= '-'
                    {
                    kw=(Token)match(input,21,FOLLOW_15); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalCityDsl.g:414:3: (this_INT_1= RULE_INT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCityDsl.g:415:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_16); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,22,FOLLOW_17); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_18); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalCityDsl.g:435:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=23 && LA16_0<=24)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCityDsl.g:436:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalCityDsl.g:436:4: (kw= 'E' | kw= 'e' )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==23) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==24) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalCityDsl.g:437:5: kw= 'E'
                            {
                            kw=(Token)match(input,23,FOLLOW_19); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalCityDsl.g:443:5: kw= 'e'
                            {
                            kw=(Token)match(input,24,FOLLOW_19); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalCityDsl.g:449:4: (kw= '-' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==21) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalCityDsl.g:450:5: kw= '-'
                            {
                            kw=(Token)match(input,21,FOLLOW_17); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleEString"
    // InternalCityDsl.g:468:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCityDsl.g:468:47: (iv_ruleEString= ruleEString EOF )
            // InternalCityDsl.g:469:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalCityDsl.g:475:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCityDsl.g:481:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCityDsl.g:482:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCityDsl.g:482:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalCityDsl.g:483:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCityDsl.g:491:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleStation"
    // InternalCityDsl.g:502:1: entryRuleStation returns [EObject current=null] : iv_ruleStation= ruleStation EOF ;
    public final EObject entryRuleStation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStation = null;


        try {
            // InternalCityDsl.g:502:48: (iv_ruleStation= ruleStation EOF )
            // InternalCityDsl.g:503:2: iv_ruleStation= ruleStation EOF
            {
             newCompositeNode(grammarAccess.getStationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStation=ruleStation();

            state._fsp--;

             current =iv_ruleStation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStation"


    // $ANTLR start "ruleStation"
    // InternalCityDsl.g:509:1: ruleStation returns [EObject current=null] : (otherlv_0= 'Station' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'location' otherlv_4= '(' (otherlv_5= 'longitude' ( (lv_longitude_6_0= ruleEDouble ) ) ) (otherlv_7= 'latitude' ( (lv_latitude_8_0= ruleEDouble ) ) ) (otherlv_9= 'altitude' ( (lv_altitude_10_0= ruleEFloat ) ) ) otherlv_11= ')' )? ( (lv_office_12_0= 'hasOffice' ) )? ( (lv_opened_13_0= 'isOpened' ) )? ( (lv_disabledAccess_14_0= 'hasDisabledAccess' ) )? otherlv_15= 'type' ( (lv_type_16_0= ruleTransportType ) ) (otherlv_17= ',' ( (lv_type_18_0= ruleTransportType ) ) )* (otherlv_19= 'nbOfTicketMachines' ( (lv_nbOfTicketMachines_20_0= ruleEInt ) ) )? (otherlv_21= 'nbOfElevators' ( (lv_nbOfElevators_22_0= ruleEInt ) ) )? (otherlv_23= 'zone' ( (lv_zone_24_0= ruleEInt ) ) )? otherlv_25= '}' ) ;
    public final EObject ruleStation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_office_12_0=null;
        Token lv_opened_13_0=null;
        Token lv_disabledAccess_14_0=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_longitude_6_0 = null;

        AntlrDatatypeRuleToken lv_latitude_8_0 = null;

        AntlrDatatypeRuleToken lv_altitude_10_0 = null;

        Enumerator lv_type_16_0 = null;

        Enumerator lv_type_18_0 = null;

        AntlrDatatypeRuleToken lv_nbOfTicketMachines_20_0 = null;

        AntlrDatatypeRuleToken lv_nbOfElevators_22_0 = null;

        AntlrDatatypeRuleToken lv_zone_24_0 = null;



        	enterRule();

        try {
            // InternalCityDsl.g:515:2: ( (otherlv_0= 'Station' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'location' otherlv_4= '(' (otherlv_5= 'longitude' ( (lv_longitude_6_0= ruleEDouble ) ) ) (otherlv_7= 'latitude' ( (lv_latitude_8_0= ruleEDouble ) ) ) (otherlv_9= 'altitude' ( (lv_altitude_10_0= ruleEFloat ) ) ) otherlv_11= ')' )? ( (lv_office_12_0= 'hasOffice' ) )? ( (lv_opened_13_0= 'isOpened' ) )? ( (lv_disabledAccess_14_0= 'hasDisabledAccess' ) )? otherlv_15= 'type' ( (lv_type_16_0= ruleTransportType ) ) (otherlv_17= ',' ( (lv_type_18_0= ruleTransportType ) ) )* (otherlv_19= 'nbOfTicketMachines' ( (lv_nbOfTicketMachines_20_0= ruleEInt ) ) )? (otherlv_21= 'nbOfElevators' ( (lv_nbOfElevators_22_0= ruleEInt ) ) )? (otherlv_23= 'zone' ( (lv_zone_24_0= ruleEInt ) ) )? otherlv_25= '}' ) )
            // InternalCityDsl.g:516:2: (otherlv_0= 'Station' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'location' otherlv_4= '(' (otherlv_5= 'longitude' ( (lv_longitude_6_0= ruleEDouble ) ) ) (otherlv_7= 'latitude' ( (lv_latitude_8_0= ruleEDouble ) ) ) (otherlv_9= 'altitude' ( (lv_altitude_10_0= ruleEFloat ) ) ) otherlv_11= ')' )? ( (lv_office_12_0= 'hasOffice' ) )? ( (lv_opened_13_0= 'isOpened' ) )? ( (lv_disabledAccess_14_0= 'hasDisabledAccess' ) )? otherlv_15= 'type' ( (lv_type_16_0= ruleTransportType ) ) (otherlv_17= ',' ( (lv_type_18_0= ruleTransportType ) ) )* (otherlv_19= 'nbOfTicketMachines' ( (lv_nbOfTicketMachines_20_0= ruleEInt ) ) )? (otherlv_21= 'nbOfElevators' ( (lv_nbOfElevators_22_0= ruleEInt ) ) )? (otherlv_23= 'zone' ( (lv_zone_24_0= ruleEInt ) ) )? otherlv_25= '}' )
            {
            // InternalCityDsl.g:516:2: (otherlv_0= 'Station' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'location' otherlv_4= '(' (otherlv_5= 'longitude' ( (lv_longitude_6_0= ruleEDouble ) ) ) (otherlv_7= 'latitude' ( (lv_latitude_8_0= ruleEDouble ) ) ) (otherlv_9= 'altitude' ( (lv_altitude_10_0= ruleEFloat ) ) ) otherlv_11= ')' )? ( (lv_office_12_0= 'hasOffice' ) )? ( (lv_opened_13_0= 'isOpened' ) )? ( (lv_disabledAccess_14_0= 'hasDisabledAccess' ) )? otherlv_15= 'type' ( (lv_type_16_0= ruleTransportType ) ) (otherlv_17= ',' ( (lv_type_18_0= ruleTransportType ) ) )* (otherlv_19= 'nbOfTicketMachines' ( (lv_nbOfTicketMachines_20_0= ruleEInt ) ) )? (otherlv_21= 'nbOfElevators' ( (lv_nbOfElevators_22_0= ruleEInt ) ) )? (otherlv_23= 'zone' ( (lv_zone_24_0= ruleEInt ) ) )? otherlv_25= '}' )
            // InternalCityDsl.g:517:3: otherlv_0= 'Station' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'location' otherlv_4= '(' (otherlv_5= 'longitude' ( (lv_longitude_6_0= ruleEDouble ) ) ) (otherlv_7= 'latitude' ( (lv_latitude_8_0= ruleEDouble ) ) ) (otherlv_9= 'altitude' ( (lv_altitude_10_0= ruleEFloat ) ) ) otherlv_11= ')' )? ( (lv_office_12_0= 'hasOffice' ) )? ( (lv_opened_13_0= 'isOpened' ) )? ( (lv_disabledAccess_14_0= 'hasDisabledAccess' ) )? otherlv_15= 'type' ( (lv_type_16_0= ruleTransportType ) ) (otherlv_17= ',' ( (lv_type_18_0= ruleTransportType ) ) )* (otherlv_19= 'nbOfTicketMachines' ( (lv_nbOfTicketMachines_20_0= ruleEInt ) ) )? (otherlv_21= 'nbOfElevators' ( (lv_nbOfElevators_22_0= ruleEInt ) ) )? (otherlv_23= 'zone' ( (lv_zone_24_0= ruleEInt ) ) )? otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getStationAccess().getStationKeyword_0());
            		
            // InternalCityDsl.g:521:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCityDsl.g:522:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCityDsl.g:522:4: (lv_name_1_0= RULE_ID )
            // InternalCityDsl.g:523:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getStationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCityDsl.g:543:3: (otherlv_3= 'location' otherlv_4= '(' (otherlv_5= 'longitude' ( (lv_longitude_6_0= ruleEDouble ) ) ) (otherlv_7= 'latitude' ( (lv_latitude_8_0= ruleEDouble ) ) ) (otherlv_9= 'altitude' ( (lv_altitude_10_0= ruleEFloat ) ) ) otherlv_11= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==13) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCityDsl.g:544:4: otherlv_3= 'location' otherlv_4= '(' (otherlv_5= 'longitude' ( (lv_longitude_6_0= ruleEDouble ) ) ) (otherlv_7= 'latitude' ( (lv_latitude_8_0= ruleEDouble ) ) ) (otherlv_9= 'altitude' ( (lv_altitude_10_0= ruleEFloat ) ) ) otherlv_11= ')'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getStationAccess().getLocationKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getStationAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalCityDsl.g:552:4: (otherlv_5= 'longitude' ( (lv_longitude_6_0= ruleEDouble ) ) )
                    // InternalCityDsl.g:553:5: otherlv_5= 'longitude' ( (lv_longitude_6_0= ruleEDouble ) )
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_8); 

                    					newLeafNode(otherlv_5, grammarAccess.getStationAccess().getLongitudeKeyword_3_2_0());
                    				
                    // InternalCityDsl.g:557:5: ( (lv_longitude_6_0= ruleEDouble ) )
                    // InternalCityDsl.g:558:6: (lv_longitude_6_0= ruleEDouble )
                    {
                    // InternalCityDsl.g:558:6: (lv_longitude_6_0= ruleEDouble )
                    // InternalCityDsl.g:559:7: lv_longitude_6_0= ruleEDouble
                    {

                    							newCompositeNode(grammarAccess.getStationAccess().getLongitudeEDoubleParserRuleCall_3_2_1_0());
                    						
                    pushFollow(FOLLOW_9);
                    lv_longitude_6_0=ruleEDouble();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getStationRule());
                    							}
                    							set(
                    								current,
                    								"longitude",
                    								lv_longitude_6_0,
                    								"com.city.network.xtext.CityDsl.EDouble");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    // InternalCityDsl.g:577:4: (otherlv_7= 'latitude' ( (lv_latitude_8_0= ruleEDouble ) ) )
                    // InternalCityDsl.g:578:5: otherlv_7= 'latitude' ( (lv_latitude_8_0= ruleEDouble ) )
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_8); 

                    					newLeafNode(otherlv_7, grammarAccess.getStationAccess().getLatitudeKeyword_3_3_0());
                    				
                    // InternalCityDsl.g:582:5: ( (lv_latitude_8_0= ruleEDouble ) )
                    // InternalCityDsl.g:583:6: (lv_latitude_8_0= ruleEDouble )
                    {
                    // InternalCityDsl.g:583:6: (lv_latitude_8_0= ruleEDouble )
                    // InternalCityDsl.g:584:7: lv_latitude_8_0= ruleEDouble
                    {

                    							newCompositeNode(grammarAccess.getStationAccess().getLatitudeEDoubleParserRuleCall_3_3_1_0());
                    						
                    pushFollow(FOLLOW_10);
                    lv_latitude_8_0=ruleEDouble();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getStationRule());
                    							}
                    							set(
                    								current,
                    								"latitude",
                    								lv_latitude_8_0,
                    								"com.city.network.xtext.CityDsl.EDouble");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    // InternalCityDsl.g:602:4: (otherlv_9= 'altitude' ( (lv_altitude_10_0= ruleEFloat ) ) )
                    // InternalCityDsl.g:603:5: otherlv_9= 'altitude' ( (lv_altitude_10_0= ruleEFloat ) )
                    {
                    otherlv_9=(Token)match(input,17,FOLLOW_8); 

                    					newLeafNode(otherlv_9, grammarAccess.getStationAccess().getAltitudeKeyword_3_4_0());
                    				
                    // InternalCityDsl.g:607:5: ( (lv_altitude_10_0= ruleEFloat ) )
                    // InternalCityDsl.g:608:6: (lv_altitude_10_0= ruleEFloat )
                    {
                    // InternalCityDsl.g:608:6: (lv_altitude_10_0= ruleEFloat )
                    // InternalCityDsl.g:609:7: lv_altitude_10_0= ruleEFloat
                    {

                    							newCompositeNode(grammarAccess.getStationAccess().getAltitudeEFloatParserRuleCall_3_4_1_0());
                    						
                    pushFollow(FOLLOW_11);
                    lv_altitude_10_0=ruleEFloat();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getStationRule());
                    							}
                    							set(
                    								current,
                    								"altitude",
                    								lv_altitude_10_0,
                    								"com.city.network.xtext.CityDsl.EFloat");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    otherlv_11=(Token)match(input,18,FOLLOW_22); 

                    				newLeafNode(otherlv_11, grammarAccess.getStationAccess().getRightParenthesisKeyword_3_5());
                    			

                    }
                    break;

            }

            // InternalCityDsl.g:632:3: ( (lv_office_12_0= 'hasOffice' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCityDsl.g:633:4: (lv_office_12_0= 'hasOffice' )
                    {
                    // InternalCityDsl.g:633:4: (lv_office_12_0= 'hasOffice' )
                    // InternalCityDsl.g:634:5: lv_office_12_0= 'hasOffice'
                    {
                    lv_office_12_0=(Token)match(input,26,FOLLOW_23); 

                    					newLeafNode(lv_office_12_0, grammarAccess.getStationAccess().getOfficeHasOfficeKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStationRule());
                    					}
                    					setWithLastConsumed(current, "office", true, "hasOffice");
                    				

                    }


                    }
                    break;

            }

            // InternalCityDsl.g:646:3: ( (lv_opened_13_0= 'isOpened' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCityDsl.g:647:4: (lv_opened_13_0= 'isOpened' )
                    {
                    // InternalCityDsl.g:647:4: (lv_opened_13_0= 'isOpened' )
                    // InternalCityDsl.g:648:5: lv_opened_13_0= 'isOpened'
                    {
                    lv_opened_13_0=(Token)match(input,27,FOLLOW_24); 

                    					newLeafNode(lv_opened_13_0, grammarAccess.getStationAccess().getOpenedIsOpenedKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStationRule());
                    					}
                    					setWithLastConsumed(current, "opened", true, "isOpened");
                    				

                    }


                    }
                    break;

            }

            // InternalCityDsl.g:660:3: ( (lv_disabledAccess_14_0= 'hasDisabledAccess' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCityDsl.g:661:4: (lv_disabledAccess_14_0= 'hasDisabledAccess' )
                    {
                    // InternalCityDsl.g:661:4: (lv_disabledAccess_14_0= 'hasDisabledAccess' )
                    // InternalCityDsl.g:662:5: lv_disabledAccess_14_0= 'hasDisabledAccess'
                    {
                    lv_disabledAccess_14_0=(Token)match(input,28,FOLLOW_25); 

                    					newLeafNode(lv_disabledAccess_14_0, grammarAccess.getStationAccess().getDisabledAccessHasDisabledAccessKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStationRule());
                    					}
                    					setWithLastConsumed(current, "disabledAccess", true, "hasDisabledAccess");
                    				

                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,29,FOLLOW_26); 

            			newLeafNode(otherlv_15, grammarAccess.getStationAccess().getTypeKeyword_7());
            		
            // InternalCityDsl.g:678:3: ( (lv_type_16_0= ruleTransportType ) )
            // InternalCityDsl.g:679:4: (lv_type_16_0= ruleTransportType )
            {
            // InternalCityDsl.g:679:4: (lv_type_16_0= ruleTransportType )
            // InternalCityDsl.g:680:5: lv_type_16_0= ruleTransportType
            {

            					newCompositeNode(grammarAccess.getStationAccess().getTypeTransportTypeEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_27);
            lv_type_16_0=ruleTransportType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStationRule());
            					}
            					add(
            						current,
            						"type",
            						lv_type_16_0,
            						"com.city.network.xtext.CityDsl.TransportType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCityDsl.g:697:3: (otherlv_17= ',' ( (lv_type_18_0= ruleTransportType ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==30) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCityDsl.g:698:4: otherlv_17= ',' ( (lv_type_18_0= ruleTransportType ) )
            	    {
            	    otherlv_17=(Token)match(input,30,FOLLOW_26); 

            	    				newLeafNode(otherlv_17, grammarAccess.getStationAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalCityDsl.g:702:4: ( (lv_type_18_0= ruleTransportType ) )
            	    // InternalCityDsl.g:703:5: (lv_type_18_0= ruleTransportType )
            	    {
            	    // InternalCityDsl.g:703:5: (lv_type_18_0= ruleTransportType )
            	    // InternalCityDsl.g:704:6: lv_type_18_0= ruleTransportType
            	    {

            	    						newCompositeNode(grammarAccess.getStationAccess().getTypeTransportTypeEnumRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_type_18_0=ruleTransportType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"type",
            	    							lv_type_18_0,
            	    							"com.city.network.xtext.CityDsl.TransportType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalCityDsl.g:722:3: (otherlv_19= 'nbOfTicketMachines' ( (lv_nbOfTicketMachines_20_0= ruleEInt ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCityDsl.g:723:4: otherlv_19= 'nbOfTicketMachines' ( (lv_nbOfTicketMachines_20_0= ruleEInt ) )
                    {
                    otherlv_19=(Token)match(input,31,FOLLOW_19); 

                    				newLeafNode(otherlv_19, grammarAccess.getStationAccess().getNbOfTicketMachinesKeyword_10_0());
                    			
                    // InternalCityDsl.g:727:4: ( (lv_nbOfTicketMachines_20_0= ruleEInt ) )
                    // InternalCityDsl.g:728:5: (lv_nbOfTicketMachines_20_0= ruleEInt )
                    {
                    // InternalCityDsl.g:728:5: (lv_nbOfTicketMachines_20_0= ruleEInt )
                    // InternalCityDsl.g:729:6: lv_nbOfTicketMachines_20_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getStationAccess().getNbOfTicketMachinesEIntParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_nbOfTicketMachines_20_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStationRule());
                    						}
                    						set(
                    							current,
                    							"nbOfTicketMachines",
                    							lv_nbOfTicketMachines_20_0,
                    							"com.city.network.xtext.CityDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCityDsl.g:747:3: (otherlv_21= 'nbOfElevators' ( (lv_nbOfElevators_22_0= ruleEInt ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCityDsl.g:748:4: otherlv_21= 'nbOfElevators' ( (lv_nbOfElevators_22_0= ruleEInt ) )
                    {
                    otherlv_21=(Token)match(input,32,FOLLOW_19); 

                    				newLeafNode(otherlv_21, grammarAccess.getStationAccess().getNbOfElevatorsKeyword_11_0());
                    			
                    // InternalCityDsl.g:752:4: ( (lv_nbOfElevators_22_0= ruleEInt ) )
                    // InternalCityDsl.g:753:5: (lv_nbOfElevators_22_0= ruleEInt )
                    {
                    // InternalCityDsl.g:753:5: (lv_nbOfElevators_22_0= ruleEInt )
                    // InternalCityDsl.g:754:6: lv_nbOfElevators_22_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getStationAccess().getNbOfElevatorsEIntParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_nbOfElevators_22_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStationRule());
                    						}
                    						set(
                    							current,
                    							"nbOfElevators",
                    							lv_nbOfElevators_22_0,
                    							"com.city.network.xtext.CityDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCityDsl.g:772:3: (otherlv_23= 'zone' ( (lv_zone_24_0= ruleEInt ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCityDsl.g:773:4: otherlv_23= 'zone' ( (lv_zone_24_0= ruleEInt ) )
                    {
                    otherlv_23=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_23, grammarAccess.getStationAccess().getZoneKeyword_12_0());
                    			
                    // InternalCityDsl.g:777:4: ( (lv_zone_24_0= ruleEInt ) )
                    // InternalCityDsl.g:778:5: (lv_zone_24_0= ruleEInt )
                    {
                    // InternalCityDsl.g:778:5: (lv_zone_24_0= ruleEInt )
                    // InternalCityDsl.g:779:6: lv_zone_24_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getStationAccess().getZoneEIntParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_zone_24_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStationRule());
                    						}
                    						set(
                    							current,
                    							"zone",
                    							lv_zone_24_0,
                    							"com.city.network.xtext.CityDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_25=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getStationAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStation"


    // $ANTLR start "entryRuleLine"
    // InternalCityDsl.g:805:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // InternalCityDsl.g:805:45: (iv_ruleLine= ruleLine EOF )
            // InternalCityDsl.g:806:2: iv_ruleLine= ruleLine EOF
            {
             newCompositeNode(grammarAccess.getLineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLine=ruleLine();

            state._fsp--;

             current =iv_ruleLine; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLine"


    // $ANTLR start "ruleLine"
    // InternalCityDsl.g:812:1: ruleLine returns [EObject current=null] : ( () otherlv_1= 'Line' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'of' ( (lv_type_5_0= ruleTransportType ) ) )? (otherlv_6= 'topology' ( (lv_topology_7_0= ruleTopology ) ) )? (otherlv_8= 'stations' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? otherlv_14= '}' ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Enumerator lv_type_5_0 = null;

        Enumerator lv_topology_7_0 = null;



        	enterRule();

        try {
            // InternalCityDsl.g:818:2: ( ( () otherlv_1= 'Line' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'of' ( (lv_type_5_0= ruleTransportType ) ) )? (otherlv_6= 'topology' ( (lv_topology_7_0= ruleTopology ) ) )? (otherlv_8= 'stations' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? otherlv_14= '}' ) )
            // InternalCityDsl.g:819:2: ( () otherlv_1= 'Line' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'of' ( (lv_type_5_0= ruleTransportType ) ) )? (otherlv_6= 'topology' ( (lv_topology_7_0= ruleTopology ) ) )? (otherlv_8= 'stations' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? otherlv_14= '}' )
            {
            // InternalCityDsl.g:819:2: ( () otherlv_1= 'Line' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'of' ( (lv_type_5_0= ruleTransportType ) ) )? (otherlv_6= 'topology' ( (lv_topology_7_0= ruleTopology ) ) )? (otherlv_8= 'stations' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? otherlv_14= '}' )
            // InternalCityDsl.g:820:3: () otherlv_1= 'Line' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'of' ( (lv_type_5_0= ruleTransportType ) ) )? (otherlv_6= 'topology' ( (lv_topology_7_0= ruleTopology ) ) )? (otherlv_8= 'stations' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )? otherlv_14= '}'
            {
            // InternalCityDsl.g:820:3: ()
            // InternalCityDsl.g:821:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLineAccess().getLineAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getLineAccess().getLineKeyword_1());
            		
            // InternalCityDsl.g:831:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalCityDsl.g:832:4: (lv_name_2_0= RULE_ID )
            {
            // InternalCityDsl.g:832:4: (lv_name_2_0= RULE_ID )
            // InternalCityDsl.g:833:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getLineAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getLineAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCityDsl.g:853:3: (otherlv_4= 'of' ( (lv_type_5_0= ruleTransportType ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCityDsl.g:854:4: otherlv_4= 'of' ( (lv_type_5_0= ruleTransportType ) )
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getLineAccess().getOfKeyword_4_0());
                    			
                    // InternalCityDsl.g:858:4: ( (lv_type_5_0= ruleTransportType ) )
                    // InternalCityDsl.g:859:5: (lv_type_5_0= ruleTransportType )
                    {
                    // InternalCityDsl.g:859:5: (lv_type_5_0= ruleTransportType )
                    // InternalCityDsl.g:860:6: lv_type_5_0= ruleTransportType
                    {

                    						newCompositeNode(grammarAccess.getLineAccess().getTypeTransportTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_type_5_0=ruleTransportType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"com.city.network.xtext.CityDsl.TransportType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCityDsl.g:878:3: (otherlv_6= 'topology' ( (lv_topology_7_0= ruleTopology ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCityDsl.g:879:4: otherlv_6= 'topology' ( (lv_topology_7_0= ruleTopology ) )
                    {
                    otherlv_6=(Token)match(input,36,FOLLOW_33); 

                    				newLeafNode(otherlv_6, grammarAccess.getLineAccess().getTopologyKeyword_5_0());
                    			
                    // InternalCityDsl.g:883:4: ( (lv_topology_7_0= ruleTopology ) )
                    // InternalCityDsl.g:884:5: (lv_topology_7_0= ruleTopology )
                    {
                    // InternalCityDsl.g:884:5: (lv_topology_7_0= ruleTopology )
                    // InternalCityDsl.g:885:6: lv_topology_7_0= ruleTopology
                    {

                    						newCompositeNode(grammarAccess.getLineAccess().getTopologyTopologyEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_topology_7_0=ruleTopology();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLineRule());
                    						}
                    						set(
                    							current,
                    							"topology",
                    							lv_topology_7_0,
                    							"com.city.network.xtext.CityDsl.Topology");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCityDsl.g:903:3: (otherlv_8= 'stations' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==37) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCityDsl.g:904:4: otherlv_8= 'stations' otherlv_9= '(' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,37,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getLineAccess().getStationsKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,14,FOLLOW_20); 

                    				newLeafNode(otherlv_9, grammarAccess.getLineAccess().getLeftParenthesisKeyword_6_1());
                    			
                    // InternalCityDsl.g:912:4: ( (otherlv_10= RULE_ID ) )
                    // InternalCityDsl.g:913:5: (otherlv_10= RULE_ID )
                    {
                    // InternalCityDsl.g:913:5: (otherlv_10= RULE_ID )
                    // InternalCityDsl.g:914:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLineRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_35); 

                    						newLeafNode(otherlv_10, grammarAccess.getLineAccess().getStationsStationCrossReference_6_2_0());
                    					

                    }


                    }

                    // InternalCityDsl.g:925:4: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==30) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalCityDsl.g:926:5: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
                    	    {
                    	    otherlv_11=(Token)match(input,30,FOLLOW_20); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getLineAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalCityDsl.g:930:5: ( (otherlv_12= RULE_ID ) )
                    	    // InternalCityDsl.g:931:6: (otherlv_12= RULE_ID )
                    	    {
                    	    // InternalCityDsl.g:931:6: (otherlv_12= RULE_ID )
                    	    // InternalCityDsl.g:932:7: otherlv_12= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getLineRule());
                    	    							}
                    	    						
                    	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_35); 

                    	    							newLeafNode(otherlv_12, grammarAccess.getLineAccess().getStationsStationCrossReference_6_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,18,FOLLOW_30); 

                    				newLeafNode(otherlv_13, grammarAccess.getLineAccess().getRightParenthesisKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getLineAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLine"


    // $ANTLR start "entryRuleEInt"
    // InternalCityDsl.g:957:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalCityDsl.g:957:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalCityDsl.g:958:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalCityDsl.g:964:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalCityDsl.g:970:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalCityDsl.g:971:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalCityDsl.g:971:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalCityDsl.g:972:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalCityDsl.g:972:3: (kw= '-' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==21) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCityDsl.g:973:4: kw= '-'
                    {
                    kw=(Token)match(input,21,FOLLOW_17); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleTransportType"
    // InternalCityDsl.g:990:1: ruleTransportType returns [Enumerator current=null] : ( (enumLiteral_0= 'BUS' ) | (enumLiteral_1= 'METRO' ) | (enumLiteral_2= 'TRAIN' ) | (enumLiteral_3= 'TRAMWAY' ) ) ;
    public final Enumerator ruleTransportType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalCityDsl.g:996:2: ( ( (enumLiteral_0= 'BUS' ) | (enumLiteral_1= 'METRO' ) | (enumLiteral_2= 'TRAIN' ) | (enumLiteral_3= 'TRAMWAY' ) ) )
            // InternalCityDsl.g:997:2: ( (enumLiteral_0= 'BUS' ) | (enumLiteral_1= 'METRO' ) | (enumLiteral_2= 'TRAIN' ) | (enumLiteral_3= 'TRAMWAY' ) )
            {
            // InternalCityDsl.g:997:2: ( (enumLiteral_0= 'BUS' ) | (enumLiteral_1= 'METRO' ) | (enumLiteral_2= 'TRAIN' ) | (enumLiteral_3= 'TRAMWAY' ) )
            int alt31=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt31=1;
                }
                break;
            case 39:
                {
                alt31=2;
                }
                break;
            case 40:
                {
                alt31=3;
                }
                break;
            case 41:
                {
                alt31=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalCityDsl.g:998:3: (enumLiteral_0= 'BUS' )
                    {
                    // InternalCityDsl.g:998:3: (enumLiteral_0= 'BUS' )
                    // InternalCityDsl.g:999:4: enumLiteral_0= 'BUS'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getTransportTypeAccess().getBUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTransportTypeAccess().getBUSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCityDsl.g:1006:3: (enumLiteral_1= 'METRO' )
                    {
                    // InternalCityDsl.g:1006:3: (enumLiteral_1= 'METRO' )
                    // InternalCityDsl.g:1007:4: enumLiteral_1= 'METRO'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getTransportTypeAccess().getMETROEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTransportTypeAccess().getMETROEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCityDsl.g:1014:3: (enumLiteral_2= 'TRAIN' )
                    {
                    // InternalCityDsl.g:1014:3: (enumLiteral_2= 'TRAIN' )
                    // InternalCityDsl.g:1015:4: enumLiteral_2= 'TRAIN'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getTransportTypeAccess().getTRAINEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTransportTypeAccess().getTRAINEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCityDsl.g:1022:3: (enumLiteral_3= 'TRAMWAY' )
                    {
                    // InternalCityDsl.g:1022:3: (enumLiteral_3= 'TRAMWAY' )
                    // InternalCityDsl.g:1023:4: enumLiteral_3= 'TRAMWAY'
                    {
                    enumLiteral_3=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getTransportTypeAccess().getTRAMWAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTransportTypeAccess().getTRAMWAYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransportType"


    // $ANTLR start "ruleTopology"
    // InternalCityDsl.g:1033:1: ruleTopology returns [Enumerator current=null] : ( (enumLiteral_0= 'LINEAR' ) | (enumLiteral_1= 'CIRCULAR' ) ) ;
    public final Enumerator ruleTopology() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCityDsl.g:1039:2: ( ( (enumLiteral_0= 'LINEAR' ) | (enumLiteral_1= 'CIRCULAR' ) ) )
            // InternalCityDsl.g:1040:2: ( (enumLiteral_0= 'LINEAR' ) | (enumLiteral_1= 'CIRCULAR' ) )
            {
            // InternalCityDsl.g:1040:2: ( (enumLiteral_0= 'LINEAR' ) | (enumLiteral_1= 'CIRCULAR' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==42) ) {
                alt32=1;
            }
            else if ( (LA32_0==43) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalCityDsl.g:1041:3: (enumLiteral_0= 'LINEAR' )
                    {
                    // InternalCityDsl.g:1041:3: (enumLiteral_0= 'LINEAR' )
                    // InternalCityDsl.g:1042:4: enumLiteral_0= 'LINEAR'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getTopologyAccess().getLINEAREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTopologyAccess().getLINEAREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCityDsl.g:1049:3: (enumLiteral_1= 'CIRCULAR' )
                    {
                    // InternalCityDsl.g:1049:3: (enumLiteral_1= 'CIRCULAR' )
                    // InternalCityDsl.g:1050:4: enumLiteral_1= 'CIRCULAR'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getTopologyAccess().getCIRCULAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTopologyAccess().getCIRCULAREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTopology"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000402182000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000600010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000402180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000402100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000003C002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000003C000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000003C0100000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000300100000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200100000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000003800100000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000003000100000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000040040000L});

}