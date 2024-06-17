package my.college.config;

import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Import({ExaminationConfig.class})
public class WebConfig implements WebMvcConfigurer {
}
