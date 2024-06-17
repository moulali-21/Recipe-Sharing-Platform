import { Component } from '@angular/core';
import {FormsModule} from '@angular/forms';
import {MatCheckboxModule} from '@angular/material/checkbox';

import {MatButtonModule} from '@angular/material/button';
import {MatCardModule} from '@angular/material/card';
import { MatIcon } from '@angular/material/icon';
import { NavbarComponent } from '../navbar/navbar.component';
import { FooterComponent } from '../footer/footer.component';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-search',
  standalone: true,
  imports: [FormsModule,MatCheckboxModule,MatButtonModule,MatCardModule,MatIcon,NavbarComponent
    ,FooterComponent,RouterLink
  ],
  templateUrl: './search.component.html',
  styleUrl: './search.component.css'
})
export class SearchComponent {

  task = [
    {
      name:"non-veg" 
    },
    {
      name:"veg"
    }
  ]

  update(completed: boolean, item : any) {
    console.log(item)
    console.log(completed)
  }
}
