import { registerPlugin } from '@capacitor/core';

import type { ProxyDetailsPlugin } from './definitions';

const ProxyDetails = registerPlugin<ProxyDetailsPlugin>('ProxyDetails');

export * from './definitions';
export { ProxyDetails };
