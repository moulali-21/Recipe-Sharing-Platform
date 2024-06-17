import { Component } from '@angular/core';
import { NavbarComponent } from '../navbar/navbar.component';
import { FooterComponent } from '../footer/footer.component';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-recipe-feed',
  standalone: true,
  imports: [NavbarComponent,FooterComponent,RouterLink],
  templateUrl: './recipe-feed.component.html',
  styleUrl: './recipe-feed.component.css'
})
export class RecipeFeedComponent {

}
