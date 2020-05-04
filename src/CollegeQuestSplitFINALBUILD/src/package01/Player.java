package package01;

import package02.SuperWeapon;

/**
 * <h1>ChoiceHandler</h1> Player class that holds and handles all player-centric
 * data (player actions, skills, inventory, armors
 *
 * @author Aaron Sedas, Aidan Becker, Prem Panchal
 * @version 1.0
 * @since 2020-05-04
 */
public class Player {

	private int playerHP, testScore, questionNum, playerDamage, study, pass, viktor, wager, duffel, weaponSkill,
			unarmedSkill, money;
	private SuperWeapon currentWeapon;
	private int outfit;

	/**
	 * This method is used to change the value of playerHP
	 * 
	 * @param num This is the value that will replace playerHP
	 * @return none
	 */
	public void setPlayerHP(int num) {
		playerHP = num;
	}

	/**
	 * This method is used to get the value of playerHP
	 * 
	 * @param none
	 * @return playerHP
	 */
	public int getPlayerHP() {
		return playerHP;
	}

	/**
	 * This method is used to change the value of testScore
	 * 
	 * @param num This is the value that will replace testScore
	 * @return none
	 */
	public void setTestScore(int num) {
		testScore = num;
	}

	/**
	 * This method is used to get the value of testScore
	 * 
	 * @param none
	 * @return testScore
	 */
	public int getTestScore() {
		return testScore;
	}

	/**
	 * This method is used to change the value of questionNum
	 * 
	 * @param num This is the value that will replace questionNum
	 * @return none
	 */
	public void setQuestionNum(int num) {
		questionNum = num;
	}

	/**
	 * This method is used to get the value of questionNum
	 * 
	 * @param none
	 * @return questionNum
	 */
	public int getQuestionNum() {
		return questionNum;
	}

	/**
	 * This method is used to change the value of playerDamage
	 * 
	 * @param num This is the value that will replace playerDamage
	 * @return none
	 */
	public void setPlayerDamage(int num) {
		playerDamage = num;
	}

	/**
	 * This method is used to get the value of playerDamage
	 * 
	 * @param none
	 * @return playerDamage
	 */
	public int getPlayerDamage() {
		return playerDamage;
	}

	/**
	 * This method is used to change the value of study
	 * 
	 * @param num This is the value that will replace study
	 * @return none
	 */
	public void setStudy(int num) {
		study = num;
	}

	/**
	 * This method is used to get the value of study
	 * 
	 * @param none
	 * @return study
	 */
	public int getStudy() {
		return study;
	}

	/**
	 * This method is used to change the value of pass
	 * 
	 * @param num This is the value that will replace pass
	 * @return none
	 */
	public void setPass(int num) {
		pass = num;
	}

	/**
	 * This method is used to get the value of pass
	 * 
	 * @param none
	 * @return pass
	 */
	public int getPass() {
		return pass;
	}

	/**
	 * This method is used to change the value of viktor
	 * 
	 * @param num This is the value that will replace viktor
	 * @return none
	 */
	public void setViktor(int num) {
		viktor = num;
	}

	/**
	 * This method is used to get the value of viktor
	 * 
	 * @param none
	 * @return viktor
	 */
	public int getViktor() {
		return viktor;
	}

	/**
	 * This method is used to change the value of wager
	 * 
	 * @param num This is the value that will replace wager
	 * @return none
	 */
	public void setWager(int num) {
		wager = num;
	}

	/**
	 * This method is used to get the value of wager
	 * 
	 * @param none
	 * @return wager
	 */
	public int getWager() {
		return wager;
	}

	/**
	 * This method is used to change the value of duffel
	 * 
	 * @param num This is the value that will replace duffel
	 * @return none
	 */
	public void setDuffel(int num) {
		duffel = num;
	}

	/**
	 * This method is used to get the value of duffel
	 * 
	 * @param none
	 * @return duffel
	 */
	public int getDuffel() {
		return duffel;
	}

	/**
	 * This method is used to change the value of weaponSkill
	 * 
	 * @param num This is the value that will replace weaponSkill
	 * @return none
	 */
	public void setWeaponSkill(int num) {
		weaponSkill = num;
	}

	/**
	 * This method is used to get the value of weaponSkill
	 * 
	 * @param none
	 * @return weaponSkill
	 */
	public int getWeaponSkill() {
		return weaponSkill;
	}

	/**
	 * This method is used to change the value of unarmedSkill
	 * 
	 * @param num This is the value that will replace unarmedSkill
	 * @return none
	 */
	public void setUnarmedSkill(int num) {
		unarmedSkill = num;
	}

	/**
	 * This method is used to get the value of unarmedSkill
	 * 
	 * @param none
	 * @return unarmedSkill
	 */
	public int getUnarmedSkill() {
		return unarmedSkill;
	}

	/**
	 * This method is used to change the value of money
	 * 
	 * @param num This is the value that will replace money
	 * @return none
	 */
	public void setMoney(int num) {
		money = num;
	}

	/**
	 * This method is used to get the value of money
	 * 
	 * @param none
	 * @return money
	 */
	public int getMoney() {
		return money;
	}

	/**
	 * This method is used to get the value of outfit
	 * 
	 * @param none
	 * @return outfit
	 */
	public int getOutfit() {
		return outfit;
	}

	/**
	 * This method is used to change the value of outfit
	 * 
	 * @param out This is the value that will replace outfit
	 * @return none
	 */
	public void setOutfit(int out) {
		outfit = out;
	}

	/**
	 * This method is used to get the value of currentWeapon
	 * 
	 * @param none
	 * @return currentWeapon
	 */
	public SuperWeapon getCurrentWeapon() {
		return currentWeapon;
	}

	/**
	 * This method is used to set the value of currentWeapon
	 * 
	 * @param currentWeapon
	 * @return none
	 */
	public void setCurrentWeapon(SuperWeapon weapon) {
		currentWeapon = weapon;
	}

}