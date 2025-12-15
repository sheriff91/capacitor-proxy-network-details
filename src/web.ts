import { WebPlugin } from '@capacitor/core';

import type { ProxyDetailsPlugin } from './definitions';

export class ProxyDetailsWeb extends WebPlugin implements ProxyDetailsPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
