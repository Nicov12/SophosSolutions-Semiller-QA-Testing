import {test} from '@playwright/test';
import { Reservate } from '../../src/Pages/NewToursFlight/Reservate';

const infoVuelos = {
    user: 'nico',
    password: '1234'
   };

//Definicion del test
test.beforeEach(async({page}) => {
    await page.goto('https://demo.guru99.com/test/newtours/');
    const reservateF = new Reservate(page);
    await reservateF.logIn(infoVuelos);

});

test(`
Given Necesito reservar un vuelo
when lleno los campos
then visualizo la reserva
`,async({page}) => {
    const reservateF = new Reservate(page);
    await reservateF.searchReserva();
});


