package SSCC.DACHSER;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST controller for handling SSCC validation requests.
 * This class exposes an API endpoint for validating SSCC numbers.
 */
@RestController
@CrossOrigin(origins = "*") // Allow cross-origin requests
@RequestMapping("/api/validate")
public class SSCCValidationController {

    @Autowired
    private SSCCValidationService validationService; // Service for SSCC validation

    /**
     * Validates the SSCC number provided in the request.
     * @param sscc The SSCC number to validate.
     * @return ResponseEntity with validation result.
     */
    @PostMapping
    public ResponseEntity<String> validateSSCC(@RequestParam("sscc") String sscc) {
        boolean isValid = validationService.validateSSCC(sscc); // Validate the SSCC
        return isValid ? ResponseEntity.ok("Valid SSCC") : ResponseEntity.badRequest().body("Invalid SSCC"); // Return appropriate response
    }
}
