package helpers;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import java.io.File;

public class Reporter {
    private static Reporter ourInstance = new Reporter();
    public ExtentReports extent = new ExtentReports();

    public static Reporter getInstance() {
        return ourInstance;
    }

    private Reporter() {
        // On Test Launch, clean any previous test reports
        cleanReporter();

        // Start a new test report
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("test-report.html");
        htmlReporter.setAppendExisting(true);
        extent.attachReporter(htmlReporter);
    }

    private void cleanReporter(){
        // Delete the previous test report
        File file = new File("test-report.html");
        file.delete();

    }
}
