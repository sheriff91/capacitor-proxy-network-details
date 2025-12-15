import { registerPlugin } from '@capacitor/core';

import type { ProxyDetailsPlugin } from './definitions';

const ProxyDetails = registerPlugin<ProxyDetailsPlugin>('ProxyDetails', {
  web: () => import('./web').then((m) => new m.ProxyDetailsWeb()),
});

export * from './definitions';
export { ProxyDetails };
