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
	private TextField txt_AbilityStrAS;
	@FXML
	private TextField txt_AbilityStrAM;
	@FXML
	private TextField txt_AbilityStrTA;
	@FXML
	private TextField txt_AbilityStrTM;
	@FXML
	private TextField txt_AbilityDexAS;
	@FXML
	private TextField txt_AbilityDexAM;
	@FXML
	private TextField txt_AbilityDexTA;
	@FXML
	private TextField txt_AbilityDexTM;
	@FXML
	private TextField txt_AbilityConAS;
	@FXML
	private TextField txt_AbilityConAM;
	@FXML
	private TextField txt_AbilityConTA;
	@FXML
	private TextField txt_AbilityConTM;
	@FXML
	private TextField txt_AbilityIntAS;
	@FXML
	private TextField txt_AbilityIntAM;
	@FXML
	private TextField txt_AbilityIntTA;
	@FXML
	private TextField txt_AbilityIntTM;
	@FXML
	private TextField txt_AbilityWisAS;
	@FXML
	private TextField txt_AbilityWisAM;
	@FXML
	private TextField txt_AbilityWisTA;
	@FXML
	private TextField txt_AbilityWisTM;
	@FXML
	private TextField txt_AbilityChaAS;
	@FXML
	private TextField txt_AbilityChaAM;
	@FXML
	private TextField txt_AbilityChaTA;
	@FXML
	private TextField txt_AbilityChaTM;
	//HP Boxes
	@FXML
	private TextField txt_MaxHPMax;
	@FXML
	private TextField txt_DamageReduction;
	@FXML
	private TextField txt_CurrentHP;
	@FXML
	private TextField txt_NonLethal;
	//AC Boxes
	@FXML
	private TextField txt_ACTotal;
	@FXML
	private TextField txt_ACArmor;
	@FXML
	private TextField txt_ACShield;
	@FXML
	private TextField txt_ACDexMod;
	@FXML
	private TextField txt_ACSizeMod;
	@FXML
	private TextField txt_ACNaturalArmor;
	@FXML
	private TextField txt_ACDeflectionMod;
	@FXML
	private TextField txt_ACMiscMod;
	//Init Boxes
	@FXML
	private TextField txt_InitTotal;
	@FXML
	private TextField txt_InitDexMod;
	@FXML
	private TextField txt_InitMiscMod;
	//Saves
	//Fortitude
	@FXML
	private TextField txt_SaveFortTotal;
	@FXML
	private TextField txt_SaveFortBase;
	@FXML
	private TextField txt_SaveFortAbilityMod;
	@FXML
	private TextField txt_SaveFortMagicMod;
	@FXML
	private TextField txt_SaveFortMiscMod;
	@FXML
	private TextField txt_SaveFortTempMod;
	//Reflex
	@FXML
	private TextField txt_SaveRflxTotal;
	@FXML
	private TextField txt_SaveRflxBase;
	@FXML
	private TextField txt_SaveRflxAbilityMod;
	@FXML
	private TextField txt_SaveRflxMagicMod;
	@FXML
	private TextField txt_SaveRflxMiscMod;
	@FXML
	private TextField txt_SaveRflxTempMod;
	//Willpower
	@FXML
	private TextField txt_SaveWillTotal;
	@FXML
	private TextField txt_SaveWillBase;
	@FXML
	private TextField txt_SaveWillAbilityMod;
	@FXML
	private TextField txt_SaveWillMagicMod;
	@FXML
	private TextField txt_SaveWillMiscMod;
	@FXML
	private TextField txt_SaveWillTempMod;
	//ALL
	@FXML
	private TextField txt_SavesTemp;
	
	//BAB SR
	@FXML
	private TextField txt_BAB;
	@FXML
	private TextField txt_SpellRes;
	//CMB
	@FXML
	private TextField txt_CMBTotal;
	@FXML
	private TextField txt_CMBBAB;
	@FXML
	private TextField txt_CMBStrMod;
	@FXML
	private TextField txt_CMBSizeMod;
	//CMD
	@FXML
	private TextField txt_CMDTotal;
	@FXML
	private TextField txt_CMDBAB;
	@FXML
	private TextField txt_CMDStrMod;
	@FXML
	private TextField txt_CMDDexMod;
	@FXML
	private TextField txt_CMDSizeMod;


}	