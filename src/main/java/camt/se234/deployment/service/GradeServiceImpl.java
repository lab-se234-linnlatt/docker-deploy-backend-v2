package camt.se234.deployment.service;

import camt.se234.deployment.entity.Grade;
import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl implements GradeService {
    @Override
// Analysis update for Lab 5: Integrating with DeepSource.io
// Testing OWASP Top 10 security reporting. 2
    public String getGrade(double score) {
        if (score > 79.5) {
            return "A";
        }
        else if (score > 74.5){
            return "B";
        }else if (score > 59.5){
            return "C";
        }else if (score > 32.5) {
            return "D";
        } else
            return "F";

    }
}
