import { Component, signal } from '@angular/core';
import {MatExpansionModule} from '@angular/material/expansion';
import { NavbarComponent } from '../navbar/navbar.component';
import { FooterComponent } from '../footer/footer.component';
import { MatIcon } from '@angular/material/icon';

@Component({
  selector: 'app-details',
  standalone: true,
  imports: [MatExpansionModule,NavbarComponent,FooterComponent,MatIcon],
  templateUrl: './details.component.html',
  styleUrl: './details.component.css'
})
export class DetailsComponent {
  readonly panelOpenState = signal(false);
}
