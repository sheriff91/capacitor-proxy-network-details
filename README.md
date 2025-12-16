# capacitor-proxy-network-details

CapacitorJS plugin to fetch proxy details from a mobile device, as defined in its network settings.

## Install

```bash
npm install capacitor-proxy-network-details
npx cap sync
```

## API

<docgen-index>

* [`getProxy()`](#getproxy)
* [Interfaces](#interfaces)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### getProxy()

```typescript
getProxy() => Promise<ProxyResult>
```

**Returns:** <code>Promise&lt;<a href="#proxyresult">ProxyResult</a>&gt;</code>

--------------------


### Interfaces


#### ProxyResult

| Prop       | Type                        |
| ---------- | --------------------------- |
| **`host`** | <code>string \| null</code> |
| **`port`** | <code>number \| null</code> |

</docgen-api>

### Example

```ts
import { ProxyDetails } from 'capacitor-proxy-network-details';

const { host, port } = await ProxyDetails.getProxy();

if (host && port) {
    console.log(`Proxy: ${host}:${port}`);
} else {
    console.log('No proxy configured');
}
```

### Upcoming features

* iOS support
* PAC handling
* VPN-aware logic
