import { Component } from '@angular/core';
import { ValidationService } from '../validation.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-sscc-input',
  standalone: true,
  templateUrl: './sscc-input.component.html',
  imports: [CommonModule, FormsModule],
  styleUrls: ['./sscc-input.component.css']
})
export class SsccInputComponent {
  sscc: string = ''; // Holds the SSCC input value
  validationMessage: string = ''; // Holds the validation message
  validationClass: string = ''; // Holds the CSS class for validation status

  constructor(private validationService: ValidationService) {}

  validate(): void {
    this.validationMessage = ''; // Reset validation message
    this.validationService.validateSSCC(this.sscc).subscribe({
      next: response => {
        if (response === 'Valid SSCC') {
          this.validationMessage = 'This is a Valid SSCC/NVE!'; // Set success message
          this.validationClass = 'success'; // Set success class
        } else {
          this.validationMessage = 'This is an Invalid SSCC/NVE'; // Set error message
          this.validationClass = 'error'; // Set error class
        }
      },
      error: (err) => {
        this.validationMessage = 'This is an Invalid SSCC/NVE'; // Set error message on error
        this.validationClass = 'error'; // Set error class
      }
    });
  }
}