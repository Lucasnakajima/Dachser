import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { SsccInputComponent } from './sscc-input/sscc-input.component';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, SsccInputComponent, FormsModule],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Validator'; // Title of the application
}
