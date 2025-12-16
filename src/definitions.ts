export interface ProxyDetailsPlugin {
  getProxy(): Promise<ProxyResult>;
}

export interface ProxyResult {
  host: string | null;
  port: number | null;
}
