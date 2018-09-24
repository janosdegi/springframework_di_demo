package guru.springframework.examplebeans;

/**
 * Created by jd on 2018.09.24..
 */
public class SpringBootApplicationPropertyDataSource {

    private String applicationName;
    private String applicationUrl;
    private String applicationUser;

    public SpringBootApplicationPropertyDataSource() {
    }

    public SpringBootApplicationPropertyDataSource(String applicationName, String applicationUrl, String applicationUser) {
        this.applicationName = applicationName;
        this.applicationUrl = applicationUrl;
        this.applicationUser = applicationUser;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getApplicationUrl() {
        return applicationUrl;
    }

    public void setApplicationUrl(String applicationUrl) {
        this.applicationUrl = applicationUrl;
    }

    public String getApplicationUser() {
        return applicationUser;
    }

    public void setApplicationUser(String applicationUser) {
        this.applicationUser = applicationUser;
    }

    @Override
    public String toString() {
        return "SpringBootApplicationPropertyDataSource{" +
                "applicationName='" + applicationName + '\'' +
                ", applicationUrl='" + applicationUrl + '\'' +
                ", applicationUser='" + applicationUser + '\'' +
                '}';
    }
}
