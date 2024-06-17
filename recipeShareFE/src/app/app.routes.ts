import { Routes } from '@angular/router';
import { RecipeFeedComponent } from './components/recipe-feed/recipe-feed.component';
import { UploadComponent } from './components/upload/upload.component';
import { SearchComponent } from './components/search/search.component';
import { DetailsComponent } from './components/details/details.component';

export const routes: Routes = [
    {
        path:'',
        component:RecipeFeedComponent,
        pathMatch:'full'
    },
    {
        path:'upload',
        component: UploadComponent
    },
    {
        path:'search',
        component:SearchComponent
    },
    {
        path:'details',
        component:DetailsComponent
    }
];
