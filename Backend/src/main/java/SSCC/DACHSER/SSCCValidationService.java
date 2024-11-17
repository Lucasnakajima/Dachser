package SSCC.DACHSER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Service class for validating SSCC numbers.
 * This class contains the business logic for SSCC validation and logging results to the database.
 */
@Service
public class SSCCValidationService {

    @Autowired
    private SSCCValidationRepository repository; // Repository for accessing SSCC records

    /**
     * Validates the provided SSCC number.
     * @param sscc The SSCC number to validate.
     * @return true if the SSCC is valid, false otherwise.
     */
    public boolean validateSSCC(String sscc) {
        boolean isValid;
        if (sscc.length() != 18) {
           isValid = false; // Invalid if length is not 18
        }
        else{

        int sum = 0;
        for (int i = 0; i < sscc.length() - 1; i++) {
            int digit = Character.getNumericValue(sscc.charAt(i));
            sum += (i % 2 == 0) ? digit * 3 : digit; // Calculate the sum based on the SSCC validation algorithm
        }
        int calculatedCheckDigit = (10 - (sum % 10)) % 10; // Calculate the expected check digit
        int actualCheckDigit = Character.getNumericValue(sscc.charAt(sscc.length() - 1));
        isValid = calculatedCheckDigit == actualCheckDigit; // Validate the check Digit
        }

        // Log result in database
        SSCCRecord record = new SSCCRecord();
        record.setSsccNumber(sscc);
        record.setIsValid(isValid);
        record.setCreatedAt(LocalDateTime.now());
        record.setUpdatedAt(LocalDateTime.now());
        repository.save(record); // Save the record to the database

        return isValid; // Return the validation result
    }
}
