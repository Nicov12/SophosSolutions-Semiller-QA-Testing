import {expect, Page} from "@playwright/test";

export class Reservate{

    readonly page: Page;
constructor(page: Page){
    this.page = page;
};

async logIn(infoUser){

    await this.page.locator("xpath= ").selectOption('za');
    const username = this.page.locator('input[name="userName"]');
    const password = this.page.locator('input[name="password"]');
    // Validamos que nos encontremos en la página.
    await expect(this.page).toHaveURL('https://demo.guru99.com/test/newtours/');
    
    await expect(this.page.locator('input[name="userName"]')).toBeVisible();

    await username.fill(infoUser.user);
    await this.page.locator('div').filter({ hasText: 'Home Flights Hotels Car Rentals Cruises Destinations Vacations Use Java Version ' }).click();
    await password.fill(infoUser.password);
    await this.page.waitForTimeout(3000);
    await this.page.getByRole('link', { name: 'Flights' }).click();
}

async searchReserva(){

  //  await this.page.frameLocator('iframe[title="\\33 rd party ad content"]').frameLocator('iframe[name="ad_iframe"]').getByRole('button', { name: 'Close ad' }).click();
    await this.page.getByRole('radio').nth(1).check();
    await this.page.locator('select[name="passCount"]').selectOption('3');
    await this.page.locator('select[name="fromPort"]').selectOption('London');
    await this.page.locator('select[name="toPort"]').selectOption('Paris');
    await this.page.locator('select[name="fromMonth"]').selectOption('10');
    await this.page.locator('select[name="toDay"]').selectOption('20');
    await this.page.locator('select[name="airline"]').selectOption('Unified Airlines');
    await this.page.getByRole('radio').nth(3).check();
    await this.page.waitForTimeout(5000);
    await this.page.getByRole('button', { name: 'Submit' }).click();
    await this.page.getByRole('cell', { name: 'SIGN-ON REGISTER SUPPORT CONTACT After flight finder - No Seats Avaialble Please press your browser\'s back button to return to the previous page or click the "BACK TO HOME" icon below to go to the homepage. © 2005, Mercury Interactive (v. 011003-1.01-058)' }).getByRole('link').nth(4).click();
}
};