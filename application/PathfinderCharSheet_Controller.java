package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PathfinderCharSheet_Controller {
	//Ability score boxes.
	@FXML
	private TextField txf_AbilityStrAS;
	@FXML
	private TextField txf_AbilityStrAM;
	@FXML
	private TextField txf_AbilityStrTA;
	@FXML
	private TextField txf_AbilityStrTM;
	@FXML
	private TextField txf_AbilityDexAS;
	@FXML
	private TextField txf_AbilityDexAM;
	@FXML
	private TextField txf_AbilityDexTA;
	@FXML
	private TextField txf_AbilityDexTM;
	@FXML
	private TextField txf_AbilityConAS;
	@FXML
	private TextField txf_AbilityConAM;
	@FXML
	private TextField txf_AbilityConTA;
	@FXML
	private TextField txf_AbilityConTM;
	@FXML
	private TextField txf_AbilityIntAS;
	@FXML
	private TextField txf_AbilityIntAM;
	@FXML
	private TextField txf_AbilityIntTA;
	@FXML
	private TextField txf_AbilityIntTM;
	@FXML
	private TextField txf_AbilityWisAS;
	@FXML
	private TextField txf_AbilityWisAM;
	@FXML
	private TextField txf_AbilityWisTA;
	@FXML
	private TextField txf_AbilityWisTM;
	@FXML
	private TextField txf_AbilityChaAS;
	@FXML
	private TextField txf_AbilityChaAM;
	@FXML
	private TextField txf_AbilityChaTA;
	@FXML
	private TextField txf_AbilityChaTM;
	//HP Boxes
	@FXML
	private TextField txf_MaxHPMax;
	@FXML
	private TextField txf_DamageReduction;
	@FXML
	private TextField txf_CurrentHP;
	@FXML
	private TextField txf_NonLethal;
	//AC Boxes
	@FXML
	private TextField txf_ACTotal;
	@FXML
	private TextField txf_ACArmor;
	@FXML
	private TextField txf_ACShield;
	@FXML
	private TextField txf_ACDexMod;
	@FXML
	private TextField txf_ACSizeMod;
	@FXML
	private TextField txf_ACNaturalArmor;
	@FXML
	private TextField txf_ACDeflectionMod;
	@FXML
	private TextField txf_ACMiscMod;
	//Init Boxes
	@FXML
	private TextField txf_InitTotal;
	@FXML
	private TextField txf_InitDexMod;
	@FXML
	private TextField txf_InitMiscMod;
	//Saves
	//Fortitude
	@FXML
	private TextField txf_SaveFortTotal;
	@FXML
	private TextField txf_SaveFortBase;
	@FXML
	private TextField txf_SaveFortAbilityMod;
	@FXML
	private TextField txf_SaveFortMagicMod;
	@FXML
	private TextField txf_SaveFortMiscMod;
	@FXML
	private TextField txf_SaveFortTempMod;
	//Reflex
	@FXML
	private TextField txf_SaveRflxTotal;
	@FXML
	private TextField txf_SaveRflxBase;
	@FXML
	private TextField txf_SaveRflxAbilityMod;
	@FXML
	private TextField txf_SaveRflxMagicMod;
	@FXML
	private TextField txf_SaveRflxMiscMod;
	@FXML
	private TextField txf_SaveRflxTempMod;
	//Willpower
	@FXML
	private TextField txf_SaveWillTotal;
	@FXML
	private TextField txf_SaveWillBase;
	@FXML
	private TextField txf_SaveWillAbilityMod;
	@FXML
	private TextField txf_SaveWillMagicMod;
	@FXML
	private TextField txf_SaveWillMiscMod;
	@FXML
	private TextField txf_SaveWillTempMod;
	//ALL
	@FXML
	private TextField txf_SavesTemp;
	
	//BAB SR
	@FXML
	private TextField txf_BAB;
	@FXML
	private TextField txf_SpellRes;
	//CMB
	@FXML
	private TextField txf_CMBTotal;
	@FXML
	private TextField txf_CMBBAB;
	@FXML
	private TextField txf_CMBStrMod;
	@FXML
	private TextField txf_CMBSizeMod;
	//CMD
	@FXML
	private TextField txf_CMDTotal;
	@FXML
	private TextField txf_CMDBAB;
	@FXML
	private TextField txf_CMDStrMod;
	@FXML
	private TextField txf_CMDDexMod;
	@FXML
	private TextField txf_CMDSizeMod;


}	