import {test} from '@playwright/test';
import { SearchAcomodationPage } from '../../src/Pages/Booking/SearchAcomodationPage';
//Definicion del test
test.beforeEach(async({page}) => {
    await page.goto('https://demo.guru99.com/test/newtours/');
    await page.locator('input[name="userName"]').fill('nico');
    await page.locator('div').filter({ hasText: 'Home Flights Hotels Car Rentals Cruises Destinations Vacations Use Java Version ' }).click();
    await page.locator('input[name="password"]').fill('1234');
    await page.waitForTimeout(3000);
    await page.getByRole('link', { name: 'Flights' }).click();
    

});

test(`
Given Necesito reservar un vuelo
when lleno los campos
then visualizo el vuelo reservado
`,async({page}) => {
    const searchAcomodationPage = new SearchAcomodationPage(page);
    await searchAcomodationPage.searchReserva();
});
