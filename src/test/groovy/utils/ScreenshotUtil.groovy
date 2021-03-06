package utils

import geb.Page
import org.apache.http.client.HttpClient
import org.apache.http.client.methods.CloseableHttpResponse
import org.apache.http.client.methods.HttpPost
import org.apache.http.entity.StringEntity
import org.apache.http.impl.client.HttpClientBuilder
import org.openqa.selenium.OutputType
import org.openqa.selenium.TakesScreenshot

class ScreenshotUtil extends Page {

    static void takeScreenShot(Page obj) {
        HttpClient client = HttpClientBuilder.create().build()
        String screenshotName = obj.getClass().name.split("\\.").last()
        HttpPost post = new HttpPost("http://localhost:8080/api/screenshot/$screenshotName")
        post.addHeader("X-Scholar-Meta-Browser", "Firefox")

        String imageString = ((TakesScreenshot)obj.driver).getScreenshotAs(OutputType.BASE64)

        StringEntity entity = new StringEntity("{\"imageData\":\"$imageString\"}")
        entity.setContentType("application/json")
        post.setEntity(entity)

        // If this fails, double-check Scholar service has started
        CloseableHttpResponse response = client.execute(post)
        println "Scholar responded with  ${response.getStatusLine()}  for ${screenshotName}"
    }
}
