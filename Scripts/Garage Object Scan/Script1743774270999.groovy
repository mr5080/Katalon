import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import com.kazurayam.ks.testobject.gc.ObjectRepositoryGarbageCollector

import groovy.json.JsonOutput

/**
 * A demonstration of ObjectRepositoryGarbageCollector.
 *
 * This TestCase outputs a JSON file which contains a list of garbage Test Objects
 * in the "Object Repository" folder.
 *
 * A "garbage" means a Test Object which is not used by any scripts
 * in the "Test Cases" folder.
 */

// the Garbage Collector instance will scan 2 folders: "Object Repository" and "Test Cases"

ObjectRepositoryGarbageCollector gc = new ObjectRepositoryGarbageCollector.Builder().build()

// gc.jsonifyGarbages() triggers scanning through the 2 folders and analyze the files.
// All forward references from TestCase scripts to TestObject entities are identified.
// Consequently, it can result a list of unused TestObjects.
// Will output the result in a JSON string

String json = gc.jsonifyGarbages()

println JsonOutput.prettyPrint(json)